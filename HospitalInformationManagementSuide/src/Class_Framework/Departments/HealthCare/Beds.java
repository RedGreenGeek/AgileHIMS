package Class_Framework.Departments.HealthCare;

import Class_Framework.Person;

public class Beds {
	Person[] beds;
	int bedsInUse;
	
	public Beds(int maxBeds) {
		this.beds = new Person[maxBeds];
		this.bedsInUse = 0;
	}
	
	public void AllocateBed(Person patient) {
		for (Person p: beds) {
			if (p == null) {
				p = patient;
				bedsInUse++;
				break;
			}
		}
	}
	
	public void AllocateBed(Person patient, int bedNo) {
		
		if (beds[bedNo] == null) {
			beds[bedNo] = patient;
			bedsInUse++;
		}
		else {System.err.println("Bed occupied");}
	}
	
	public void Discharge(Person patient) {
		for (Person p: beds) {
			if (p == patient) {
				p = null;
				bedsInUse--;
				break;
			}
		}
	}
	
	public void Discharge(int bedNo) {
		beds[bedNo] = null;
		bedsInUse--;
	}
	
	public int getMaxBeds() {
		return beds.length;
	}

	public int getBedsInUse() {
		return bedsInUse;
	}

	public void setBedsInUse(int bedsInUse) {
		this.bedsInUse = bedsInUse;
	}
	
	 public boolean getBedsAvailable() {
		 boolean Beds = bedsInUse<beds.length;
		 return Beds;
	 }

}
