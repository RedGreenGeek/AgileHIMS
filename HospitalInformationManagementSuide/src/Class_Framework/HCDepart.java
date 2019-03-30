package Class_Framework;

import java.util.*;

public abstract class HCDepart extends Department{	
	protected HashSet<Patient> patientSet = new HashSet<Patient>();
	
	protected HashSet<Patient> getPatient(){
		return patientSet;
	}
	
	protected void setPatient(HashSet<Patient> patientSet) {
		this.patientSet = patientSet;
	}
}
