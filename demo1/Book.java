package demo1;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Book {

    private String name;
    private String author;
    private String publisher;
    private String isbn;
    @XmlElement(name = "rdf:resource")
    private ArrayList<Address> addressList;

    // If you like the variable name, e.g. "name", you can easily change this
    // name for your XML-Output:
    @XmlElement(name = "title")
    public String getName() {
        return name;
    }


	public ArrayList<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}


	public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
