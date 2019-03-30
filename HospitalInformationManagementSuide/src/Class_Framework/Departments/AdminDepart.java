package Class_Framework.Departments;
import Class_Framework.Department;
import Class_Framework.Person;

import java.util.*;

public class AdminDepart extends Department {
	public AdminDepart(String departName, HashSet<Person> staffSet) {
		super.setName(departName);
		super.setStaff(staffSet);
	}
	
	@Override
	protected void setPatient(HashSet<Person> patientSet) {
		System.err.println("Warning, AdminDepartments cannot be assigned any patients.");
	}
	
}
