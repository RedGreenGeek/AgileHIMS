package Class_Framework;

import java.util.HashSet;

public abstract class Department {
	protected HashSet<Staff> staffSet;
	protected HashSet<Patient> patientSet;
	protected String departName;
	
	protected HashSet<Staff> getStaff() {
		return this.staffSet;
	}
	
	protected void setStaff(HashSet<Staff> staffSet) {
		this.staffSet = staffSet;
	}

	protected HashSet<Patient> getPatient(){
		return patientSet;
	}
	
	protected void setPatient(HashSet<Patient> patientSet) {
		this.patientSet = patientSet;
	}
}
