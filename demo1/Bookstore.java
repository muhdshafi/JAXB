package demo1;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(name = "rdf:RDF")
public class Bookstore {

    // XmLElementWrapper generates a wrapper element around XML representation
  //  @XmlElementWrapper(name = "bookList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "rdf:Description")
    private ArrayList<Book> bookList;

	private String name;
    
    private String location;

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBooksList() {
        return bookList;
    }

    public String getName() {
        return name;
    }
    @XmlAttribute (name = "bbb")
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    @XmlAttribute (name = "aaa")
    public void setLocation(String location) {
        this.location = location;
    }
}