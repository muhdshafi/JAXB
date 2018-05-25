package demo2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Second")
public class SecondLevel {
	@XmlElement(name = "2E1")
	public String getSlval1() {
		return slval1;
	}

	public void setSlval1(String slval1) {
		this.slval1 = slval1;
	}
	@XmlElement(name = "2E2")
	public String getSlval2() {
		return slval2;
	}

	public void setSlval2(String slval2) {
		this.slval2 = slval2;
	}
	@XmlAttribute(name = "2A3")
	public String getSlval3() {
		return slval3;
	}

	public void setSlval3(String slval3) {
		this.slval3 = slval3;
	}

	private String slval1;
	private String slval2;
	private String slval3;
	private ThirdLevel t;
	@XmlElement (name = "Third")
	public ThirdLevel getT() {
		return t;
	}

	public void setT(ThirdLevel t) {
		this.t = t;
	}
	
}
