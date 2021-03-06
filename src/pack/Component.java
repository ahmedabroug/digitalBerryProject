package pack;

import javax.xml.bind.annotation.XmlAccessorType;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "component")
@XmlAccessorType(XmlAccessType.FIELD)
public class Component {
	
	@XmlElement(name = "vendor")
	private String vendor;
	
	@XmlElement(name = "library")
	private String library;
	
	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "version")
	private String version;
	
	@XmlElementWrapper(name = "busInterfaces")
	@XmlElement(name = "busInterface")
	private List<BusInterface> busInterfaces;
	
	@XmlElementWrapper(name = "memoryMaps")
	@XmlElement(name = "memoryMap")
	private List<MemoryMap> memoryMaps;
	
	@XmlElement(name = "model")
	private Model model;
	
	public String getVendor() {
		return vendor;
	}
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getLibrary() {
		return library;
	}
	public void setLibrary(String library) {
		this.library = library;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	public List<BusInterface> getBusInterfaces() {
		return busInterfaces;
	}
	
	public void setBusInterfaces(List<BusInterface> busInterfaces) {
		this.busInterfaces = busInterfaces;
	}
	public List<MemoryMap> getMemoryMaps() {
		return memoryMaps;
	}
	
	public void setMemoryMaps(List<MemoryMap> memoryMaps) {
		this.memoryMaps = memoryMaps;
	}
	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Component [vendor=" + vendor + ", library=" + library + ", name=" + name + ", version=" + version
				+ ", busInterfaces=" + busInterfaces + ", memoryMaps=" + memoryMaps + ", model=" + model + "]";
	}
	
	

	
	

}
