
public class CustomerRunner {
	
	public static void main(String[] args) {
		Address homeAddress = new Address("서울시","구로구","08350")
		Customer customer = new Customer("김재혁",homeAddress);
				
		Address homeAddress = new Address("서울시","구로구","08350")		
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		
	}

}
