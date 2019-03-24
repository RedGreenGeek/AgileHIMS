package Class_Framework;

import java.util.HashSet;

public class HCDepart extends Department{	
	public HCDepart(String departName, HashSet<Staff> staffSet, HashSet<Patient> patientSet) {
		this.departName = departName;
		this.staffSet = staffSet;
		this.patientSet = patientSet;
	}
}
