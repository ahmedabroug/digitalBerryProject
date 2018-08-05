package pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "field")
@XmlAccessorType(XmlAccessType.FIELD)
public class Field {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "description")
	private String description;
	@XmlElement(name = "bitOffset")
	private String bitOffset;
	@XmlElement(name = "bitWidth")
	private String bitWidth;
	@XmlElement(name = "access")
	private String access;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBitOffset() {
		return bitOffset;
	}
	public void setBitOffset(String bitOffset) {
		this.bitOffset = bitOffset;
	}
	public String getBitWidth() {
		return bitWidth;
	}
	public void setBitWidth(String bitWidth) {
		this.bitWidth = bitWidth;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	
	
	

}
