package Class_Framework;

import java.util.*;

public class HCDepart extends Department{	
	public HCDepart(String departName, HashSet<Staff> staffSet, HashSet<Patient> patientSet) {
		this.departName = departName;
		this.staffSet = staffSet;
		this.patientSet = patientSet;
	}
}
