package Class_Framework;

public class Nurse extends Staff{
	public Nurse(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Nurse");
		this.setID("N");
		this.setEmail();
	}

}
