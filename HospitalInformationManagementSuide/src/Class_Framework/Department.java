package Class_Framework;

import java.util.*;

public abstract class Department {
	protected HashSet<Staff> staffSet;

	protected String departName;
	
	protected HashSet<Staff> getStaff() {
		return this.staffSet;
	}
	
	protected void setStaff(HashSet<Staff> staffSet) {
		this.staffSet = staffSet;
	}

	protected HashSet<Patient> getPatient(){
		System.err.println("Warning, only HCDepartments has patients.");
		return(new HashSet<Patient>());
	}
	
	protected void setPatient(HashSet<Patient> patientSet) {}
}
