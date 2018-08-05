package pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "busInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class BusInterface {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "busType")
	private String busType;
	@XmlElement(name = "slave")
	private String slave;
	@XmlElement(name = "connectionRequired")
	private String connectionRequired;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getSlave() {
		return slave;
	}
	public void setSlave(String slave) {
		this.slave = slave;
	}
	public String getConnectionRequired() {
		return connectionRequired;
	}
	public void setConnectionRequired(String connectionRequired) {
		this.connectionRequired = connectionRequired;
	}
	
	

}
