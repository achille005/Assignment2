package entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "address")
public class Addresses {

	private Address address = new Address();
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
