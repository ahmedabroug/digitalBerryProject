package pack;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "register")
@XmlAccessorType(XmlAccessType.FIELD)
public class Register {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "description")
	private String description;
	@XmlElement(name = "addressOffset")
	private String addressOffset;
	@XmlElement(name = "size")
	private String size;
	@XmlElement(name = "access")
	private String access;
	@XmlElement(name = "reset")
	private Reset reset;
	
    @XmlElementWrapper(name = "parameters")
    @XmlElement(name = "parameter")
	private List<Parameter> parameters;
    
	@XmlElement(name = "field")
	private List<Field> field;
	
	
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
	public String getAddressOffset() {
		return addressOffset;
	}
	public void setAddressOffset(String addressOffset) {
		this.addressOffset = addressOffset;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public Reset getReset() {
		return reset;
	}
	public void setReset(Reset reset) {
		this.reset = reset;
	}
	public List<Parameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	public List<Field> getField() {
		return field;
	}
	public void setField(List<Field> field) {
		this.field = field;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", Description=" + description + ", addressOffset=" + addressOffset
				+ ", size=" + size + ", access=" + access + ", reset=" + reset + ", parameters=" + parameters
				+ ", field=" + field + "]";
	}
	
	
	
	

}
