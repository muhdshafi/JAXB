package demo2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import demo1.Bookstore;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		ThirdLevel t = new ThirdLevel();
		t.setTlval1("3311");		
		t.setTlval1("3322");
		
		SecondLevel s = new SecondLevel();
		s.setSlval1("2211");
		s.setSlval2("2222");
		s.setSlval3("2233");
		s.setT(t);
		
		FirstLevel f = new FirstLevel();
		f.setFlval1("1111");
		f.setFlval2("1122");
		f.setFlval3("1133");
		f.setSecond(s);
		
        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(FirstLevel.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(f, System.out);
		
	}

}
