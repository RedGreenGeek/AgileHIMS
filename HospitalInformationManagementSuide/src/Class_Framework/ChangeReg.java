package Class_Framework;

import java.util.HashSet;

import Class_Framework.Departments.HealthCare.InPatientDepart;
import Class_Framework.person.Patient;
import Class_Framework.person.Staff;
import patient_admission.BedsAvailable;

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
		HashSet<Person> staffSet = d.getStaff();
		staffSet.add(s);
		d.setStaff(staffSet);
	}
	public void remove(Department d, Staff s) {
		HashSet<Person> staffSet = d.getStaff();
		staffSet.remove(s);
		d.setStaff(staffSet);
	}
	
	public void add(Department d, Patient p) {
		HashSet<Person> patientSet = d.getPatient();
		if (d instanceof InPatientDepart) {
			InPatientDepart IPD = (InPatientDepart)d;
			if (IPD.beds.getBedsAvailable()) {
				patientSet.add(p);
				d.setPatient(patientSet);
			}
		}
		else {System.err.println("Only Available to InPatient and OutPatient Departments.");}
	}
	public void remove(Department d, Patient p) {
		HashSet<Person> patientSet = d.getPatient();
		patientSet.remove(p);
		d.setPatient(patientSet);
	}
}