package Class_Framework;

public class Patient extends Person {
private static int patientID;


public int getPatientID() {
	return this.patientID;
}

public Patient(String firstName, String lastName, String adress, String tribe, int day, int month, int year, boolean alive) {
	this.setFirstName(firstName);
	this.setLastName(lastName);
	this.setAlive(alive);
	this.setBirthDay(day, month, year);
	this.setTribe(tribe);
	Patient.patientID +=1;
	
}
}