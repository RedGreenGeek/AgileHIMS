package Class_Framework;

import java.util.HashSet;

public class ChangeReg {
	public void add(Hospital h, Department d) {
		HashSet<Department> departSet = h.getDepartSet();
		departSet.add(d);
		h.setDepartSet(departSet);
	}
	public void remove(Hospital h, Department d) {
		HashSet<Department> departSet = h.getDepartSet();
		departSet.remove(d);
		h.setDepartSet(departSet);
	}
	
	public void add(Department d, Staff s) {
		HashSet<Staff> staffSet = d.getStaff();
		staffSet.add(s);
		d.setStaff(staffSet);
	}
	public void remove(Department d, Staff s) {
		HashSet<Staff> staffSet = d.getStaff();
		staffSet.remove(s);
		d.setStaff(staffSet);
	}
	
	public void add(Department d, Patient p) {
		HashSet<Patient> patientSet = d.getPatient();
		patientSet.add(p);
		d.setPatient(patientSet);
	}
	public void remove(Department d, Patient p) {
		HashSet<Patient> patientSet = d.getPatient();
		patientSet.remove(p);
		d.setPatient(patientSet);
	}
}