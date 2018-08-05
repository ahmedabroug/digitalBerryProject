package main;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pack.Component;
import pack.Field;
import pack.MemoryMap;
import pack.Parameter;
import pack.Register;

public class Main {

	public static void main(String[] args) {

		try {

			String fileName = "resources/UART.xml";
			ClassLoader classLoader = new Main().getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Component.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Component component = (Component) jaxbUnmarshaller.unmarshal(file);
			List<MemoryMap> memoryMaps = component.getMemoryMaps();
			List<Register> registers = memoryMaps.get(0).getAddressBlock().getRegisters();
			for (Register register : registers) {
				System.out.print("#######Register####### "+register.getName());
				System.out.print(register.getDescription());
				System.out.print(register.getAddressOffset());
				System.out.print(register.getSize());
				System.out.print(register.getAccess());
				if (register.getReset() != null) {
					System.out.println(register.getReset().getValue());
				}
				else 
					System.out.println();

				List<Field> fields = register.getField();
				if (fields != null)
				for (Field field : fields){
					if (field != null){
					System.out.println("#######Field "+field.getName());
					System.out.println(field.getDescription());
					System.out.println(field.getBitOffset());
					System.out.println(field.getAccess());
					System.out.println(field.getBitWidth());
					}

				}
				List<Parameter> parameters = register.getParameters();
				if (parameters != null)
				for (Parameter paramaeter : parameters){
					if (paramaeter != null){
					System.out.println("#######Parameter "+paramaeter.getName());
					System.out.println(paramaeter.getValue());
					}
				}

			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
