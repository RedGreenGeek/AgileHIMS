package API;

import java.util.*;

import Class_Framework.*;

public class API {
	private static API api;
	private HashMap<String,Integer> checkKey = dataBase.getPasswordMap();
	private Hospital h = new Hospital(dataBase.getDepartments());
	private Searcher se = Searcher.getInstance(h);
	private ChangeReg cr = new ChangeReg();
	
	public static synchronized API getInstance() {
		if (api==null) {
			api = new API();
			return api;
		}
		else {
			return api;
		}
	}
	
	private API() {}
	
	//ITC-officer
	protected void addDepartment() {}
	protected void removeDepartment() {}
	
	//ITC-officer, clerks
	protected void addStaff() {}
	protected void removeStaff() {}
	protected void patientsInHospital() {}
	protected void staffInHospital() {}
	protected void patientsInGivenDepartment() {}
	
	//ITC-officer, clerks, doctors, nurses
	protected void regPatient() {}
	protected void removePatinet() {}
	protected void movePatient() {}
	protected void changePatinet() {}
	
	//ITC-officer, doctors, nurses
	protected void patinetsInMyDepartment() {}
	protected void bedStatus() {}
}
