package Class_Framework;

import java.util.HashSet;

public class InPatientDepart extends HCDepart{
	private int maxBeds;
	private int bedsInUse;
	
	public InPatientDepart(String departName, HashSet<Staff> staffSet, HashSet<Patient> patientSet, int maxBeds) {
		this.departName = departName;
		this.staffSet = staffSet;
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


