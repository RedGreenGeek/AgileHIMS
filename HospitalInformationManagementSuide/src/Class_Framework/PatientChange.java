package Class_Framework;

import java.util.HashSet;

public class PatientChange implements ChangeRegister {
	Patient p;
	Department d;
	
	public PatientChange(Department d, Patient p) {
		this.d = d;
		this.p = p;
	}
	
	public void add() {
		HashSet<Patient> patientSet = this.d.getPatient();
		patientSet.add(p);
		this.d.setPatient(patientSet);
	}
	
	public void remove() {
		HashSet<Patient> patientSet = this.d.getPatient();
		patientSet.remove(p);
		this.d.setPatient(patientSet);
	}
}
