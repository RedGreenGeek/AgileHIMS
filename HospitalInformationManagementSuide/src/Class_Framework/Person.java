package Class_Framework;

public abstract class Person {
	
private String firstName;
private String lastName;

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

protected void setFirstName(String name) {
	this.firstName = name;
}

protected void setLastName(String name) {
	this.lastName = name;
}

}
