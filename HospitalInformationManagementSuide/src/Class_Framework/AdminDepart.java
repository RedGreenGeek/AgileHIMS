package Class_Framework;

import java.util.*;

public class AdminDepart extends Department {
	public AdminDepart(String departName, HashSet<Staff> staffSet) {
		this.departName = departName;
		this.staffSet = staffSet;
	}
	
	@Override
	protected void setPatient(HashSet<Patient> patientSet) {
		System.err.println("Warning, AdminDepartments cannot be assigned any patients.");
	}
}
