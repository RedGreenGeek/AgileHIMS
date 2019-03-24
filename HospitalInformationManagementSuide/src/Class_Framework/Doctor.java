package Class_Framework;

public class Doctor extends Staff{
	public Doctor(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("Doctor");
		this.setID("D");
		this.setEmail();
	}
}
