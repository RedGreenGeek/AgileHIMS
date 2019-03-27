package Class_Framework;

import java.util.HashSet;

public class InPatientDepart extends HCDepart{
	int maxBeds;
	int bedsInUse;
	
	public InPatientDepart(String departName, HashSet<Staff> staffSet, HashSet<Patient> patientSet, int maxBeds) {
		this.departName = departName;
		this.staffSet = staffSet;
		this.patientSet = patientSet;
		this.maxBeds = maxBeds;
	}
}


