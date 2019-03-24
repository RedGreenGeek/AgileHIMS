package Class_Framework;

public class Doctor extends Staff{
	public Doctor(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Doctor");// It's very important that you first define job type, then ID and lastly email because they use each other
		this.setID("D");
		this.setEmail();
	}
}
