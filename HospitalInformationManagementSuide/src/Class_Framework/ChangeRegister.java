package Class_Framework;

import java.util.HashSet;


public abstract class ChangeRegister {
	public void add(Hospital H,Department D) {
		HashSet<Department> departSet = H.getDepartSet();
		departSet.add(D);
		H.setDepartSet(departSet);
	}
	public void remove(Hospital H,Department D) {
		HashSet<Department> departSet = H.getDepartSet();
		departSet.remove(D);
		H.setDepartSet(departSet);
	}
	
	public void add(Department D, Staff s) {
		HashSet<Staff> staffSet = D.getStaff();
		staffSet.add(s);
		D.setStaff(staffSet);
	}
	public void remove(Department D, Staff s) {
		HashSet<Staff> staffSet = D.getStaff();
		staffSet.remove(s);
		D.setStaff(staffSet);
	}
	
	public void add(Department D, Patient p) {
		HashSet<Patient> patientSet = D.getPatient();
		patientSet.add(p);
		D.setPatient(patientSet);
	}
	public void remove(Department D, Patient p) {
		HashSet<Patient> patientSet = D.getPatient();
		patientSet.remove(p);
		D.setPatient(patientSet);
	}
}