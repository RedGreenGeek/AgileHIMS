package Class_Framework;

public class Nurse extends Staff{
	public Nurse(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Nurse");// It's very important that you first define job type, then ID and lastly email because they use each other
		this.setID("N");
		this.setEmail();
	}

}
