package pack;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "memoryMaps")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemoryMaps {
	
	 @XmlElementWrapper(name = "memoryMaps")
	 @XmlElement(name = "memoryMap")
	private List<MemoryMap> memoryMaps;

	public List<MemoryMap> getMemoryMaps() {
		return memoryMaps;
	}

	public void setMemoryMaps(List<MemoryMap> memoryMaps) {
		this.memoryMaps = memoryMaps;
	}

	@Override
	public String toString() {
		return "MemoryMaps [memoryMaps=" + memoryMaps + "]";
	}
	
	

}
