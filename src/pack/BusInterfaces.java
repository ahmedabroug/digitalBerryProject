package pack;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "busInterfaces")
@XmlAccessorType(XmlAccessType.FIELD)
public class BusInterfaces {
    @XmlElementWrapper(name = "busInterfaces")
    @XmlElement(name = "busInterface")
	private List<BusInterface> busInterfaces;

	public List<BusInterface> getBusInterfaces() {
		return busInterfaces;
	}

	public void setBusInterfaces(List<BusInterface> busInterfaces) {
		this.busInterfaces = busInterfaces;
	}
	

}
