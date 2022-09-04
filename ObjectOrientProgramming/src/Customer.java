
public class Customer {
	private String name;
	private Address homeAddress;
	private Address address;

	public Customer(String name, Address homeAddress,Address address) {
		this.name=name;
		this.homeAddress =homeAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
