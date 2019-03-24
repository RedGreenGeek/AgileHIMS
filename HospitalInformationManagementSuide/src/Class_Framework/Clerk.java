package Class_Framework;

public class Clerk extends Staff{
	public Clerk(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Clerk");
		this.setID("C");
		this.setEmail();
	}
}
