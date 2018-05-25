package demo2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Third")
public class ThirdLevel {
	private String tlval1;
	@XmlElement
	public String getTlval1() {
		return tlval1;
	}

	public void setTlval1(String tlval1) {
		this.tlval1 = tlval1;
	}
	@XmlAttribute
	public String getTlval2() {
		return tlval2;
	}

	public void setTlval2(String tlval2) {
		this.tlval2 = tlval2;
	}

	private String tlval2;
}
