package demo1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	private String coundry;
	private String state;

	public String getCoundry() {
		return coundry;
	}

	public void setCoundry(String coundry) {
		this.coundry = coundry;
	}

	public String getState() {
		return state;
	}
	@XmlAttribute (name = "state")
	public void setState(String state) {
		this.state = state;
	}

}
