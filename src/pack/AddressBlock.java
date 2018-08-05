package pack;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "addressBlock")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressBlock {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "baseAddress")
	private String baseAddress;
	@XmlElement(name = "range")
	private String range;
	@XmlElement(name = "width")
	private String width;
	
    
    @XmlElement(name = "register")
	private List<Register> registers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaseAddress() {
		return baseAddress;
	}
	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public List<Register> getRegisters() {
		return registers;
	}
	public void setRegisters(List<Register> registers) {
		this.registers = registers;
	}
	
	

}
