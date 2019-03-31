package Class_Framework.Departments.HealthCare;

import java.util.HashSet;

import Class_Framework.Person;
import Class_Framework.Departments.HCDepart;

public class InPatientDepart extends HCDepart{
	public Beds beds;
		
	public InPatientDepart(String departName, HashSet<Person> staffSet, HashSet<Person> patientSet, int maxBeds) {
		super.setName(departName);
		super.setStaff(staffSet); 
		this.patientSet = patientSet;
		this.beds = new Beds(maxBeds);
	}
	

}


