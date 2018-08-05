package main;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pack.Component;

public class Main {

	public static void main(String[] args) {

		 try {

			 String fileName = "resources/UART.xml";
		        ClassLoader classLoader = new Main().getClass().getClassLoader();
		       File file = new File(classLoader.getResource(fileName).getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Component.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			Component customer = (Component) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.getMemoryMaps().get(0).getName());

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

		}
	

}
