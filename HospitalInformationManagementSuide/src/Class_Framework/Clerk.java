package Class_Framework;

public class Clerk extends Staff{
	public Clerk(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Clerk");// It's very important that you first define job type, then ID and lastly email because they use each other
		this.setID("C");
		this.setEmail();
	}
}
