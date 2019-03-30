package Class_Framework.Departments.HealthCare;

import java.util.HashSet;

import Class_Framework.Person;
import Class_Framework.Departments.HCDepart;

public class InPatientDepart extends HCDepart{
	private int maxBeds;
	private int bedsInUse;
	
	public InPatientDepart(String departName, HashSet<Person> staffSet, HashSet<Person> patientSet, int maxBeds) {
		super.setName(departName);
		super.setStaff(staffSet); 
		this.patientSet = patientSet;
		this.maxBeds = maxBeds;
	}
	
	public int getMaxBeds() {
		return maxBeds;
	}

	public int getBedsInUse() {
		return bedsInUse;
	}

	public void setBedsInUse(int bedsInUse) {
		this.bedsInUse = bedsInUse;
	}
}


