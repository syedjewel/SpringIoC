package problem;

public class Employee {
	
	String name;
	private Address address = new Address();
	
	
	public String getCityName() {
		
		return address.getCityName();
	}

	
	public void sendGreetingCard(String greeting, Address address) {
		System.out.println("Message " + greeting + "sent to " + address);
		       }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
