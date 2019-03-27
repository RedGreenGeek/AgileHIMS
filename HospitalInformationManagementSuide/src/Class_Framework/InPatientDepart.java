package Class_Framework;

import java.util.HashSet;

public class InPatientDepart extends HCDepart{
	public InPatientDepart(String departName, HashSet<Staff> staffSet, HashSet<Patient> patientSet) {
		this.departName = departName;
		this.staffSet = staffSet;
		this.patientSet = patientSet;
	}
}


