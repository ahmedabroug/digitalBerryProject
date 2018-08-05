package pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "memoryMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemoryMap {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "addressBlock")
	private AddressBlock addressBlock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressBlock getAddressBlock() {
		return addressBlock;
	}
	public void setAddressBlock(AddressBlock addressBlock) {
		this.addressBlock = addressBlock;
	}
	
	
	

}
