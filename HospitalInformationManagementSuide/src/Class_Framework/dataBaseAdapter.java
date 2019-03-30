package Class_Framework;

import java.util.HashSet;

public interface dataBaseAdapter {
	
	public void SetDatabase(HashSet<Department> departSet);

	public void getDepartSet();
	
	public void SetDatabase(HashSet<Staff> StaffSet,Department departName);
	// I am unsure how the system will react on the difference between the two hashSets, but that is for the inplementation, to figure out. Sorry.
	public void getStaffSet();
	
	public void SetDatabase(HashSet<Patient> PatientSet,HCDepart departName);
	
	public void getPatientSet();
	
}
