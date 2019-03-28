package Class_Framework;

import java.util.*;

public class Hospital {
	private HashSet<Department> departSet = new HashSet<Department>();
	
	public Hospital(HashSet<Department> departSet) {
		this.departSet = departSet;
	}
	
	protected void setDepartSet(HashSet<Department> departSet) {
		this.departSet = departSet;
	}
	
	public HashSet<Department> getDepartSet() {
		return this.departSet;
	}
	
//	public Department getDepartment(String departName) {
//
//		for (Department i:this.departSet) {
//			if (i.departName == departName) {
//			return i;
//			}
//		}
//		throw new IllegalArgumentException("No such department");
//	}
	
	public HashSet<Staff> getAllStaff(){
		HashSet<Staff> staffSet = new HashSet<Staff>();
		LinkedList<Department> departList = new LinkedList<Department>(this.departSet);
		while (!departList.isEmpty()) {
			staffSet.addAll(departList.removeFirst().getStaff());
		}
		return staffSet;
	}
	
	public HashSet<Patient> getAllPatient(){
		HashSet<Patient> patientSet = new HashSet<Patient>();
		LinkedList<Department> departList = new LinkedList<Department>(this.departSet);
		while (!departList.isEmpty()) {
			if (departList.getFirst() instanceof HCDepart) {
				patientSet.addAll(departList.removeFirst().getPatient());
			}
			else {
				departList.removeFirst();
			}
		}
		return patientSet;
	}
}