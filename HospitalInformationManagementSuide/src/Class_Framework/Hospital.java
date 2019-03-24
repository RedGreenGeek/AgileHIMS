package Class_Framework;

import java.util.HashSet;
import java.util.LinkedList;

public class Hospital {
	private HashSet<Department> departSet = new HashSet<Department>();
	
	public Hospital(HashSet<Department> departSet) {
		this.departSet = departSet;
	}
	
	protected void setDepartSet(HashSet<Department> departSet) {
		this.departSet = departSet;
	}
	
	protected HashSet<Department> getDepartSet() {
		return this.departSet;
	}
	
	protected HashSet<Staff> getAllStaff(){
		HashSet<Staff> staffSet = new HashSet<Staff>();
		LinkedList<Department> departList = new LinkedList<Department>(this.departSet);
		while (!departList.isEmpty()) {
			staffSet.addAll(departList.removeFirst().getStaff());
		}
		return staffSet;
	}
	
	protected HashSet<Patient> getAllPatient(){
		HashSet<Patient> patientSet = new HashSet<Patient>();
		LinkedList<Department> departList = new LinkedList<Department>(this.departSet);
		while (!departList.isEmpty()) {
			if (departList.getFirst().getClass().isInstance(HCDepart.class)) {
				patientSet.addAll(departList.removeFirst().getPatient());
			}
			else {
				departList.removeFirst();
			}
		}
		return patientSet;
	}
}