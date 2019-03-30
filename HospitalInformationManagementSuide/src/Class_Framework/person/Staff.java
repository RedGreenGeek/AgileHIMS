package Class_Framework.person;

import Class_Framework.Person;

public abstract class Staff extends Person{
private String email;
private String serialID;
private String jobType;
private static int counter;

protected void setJobType(String jobType) {
	this.jobType = jobType;
}

public String getJobType() {
	return this.jobType;
}

protected void setID(String jobTypeID) {
	this.serialID = jobTypeID + Staff.counter;
	Staff.counter +=1; 
}

public String getID() {
	return serialID;
}

protected void setEmail() {
	this.email = this.getFirstName() + this.getLastName() + "_" + this.serialID + "@mail.com";
}

public String getEmail() {
	return email;
}
}

