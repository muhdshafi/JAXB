package demo2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "First")
public class FirstLevel {
	@XmlElement(name = "1E1")
	public String getFlval1() {
		return flval1;
	}

	public void setFlval1(String flval1) {
		this.flval1 = flval1;
	}

	@XmlElement(name = "1E2")
	public String getFlval2() {
		return flval2;
	}

	public void setFlval2(String flval2) {
		this.flval2 = flval2;
	}

	@XmlElement(name = "1A3")
	public String getFlval3() {
		return flval3;
	}

	public void setFlval3(String flval3) {
		this.flval3 = flval3;
	}

	private String flval1;
	private String flval2;
	private String flval3;
	private SecondLevel second;
	
	@XmlElement(name = "Second")
	public SecondLevel getSecond() {
		return second;
	}

	public void setSecond(SecondLevel second) {
		this.second = second;
	}

}
