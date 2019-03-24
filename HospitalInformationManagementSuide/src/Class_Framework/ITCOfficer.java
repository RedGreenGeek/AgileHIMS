package Class_Framework;

public class ITCOfficer extends Staff{
	public ITCOfficer(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJobType("ITC Officer"); // It's very important that you first define job type, then ID and lastly email because they use each other
		this.setID("IT");
		this.setEmail();
	}

}
