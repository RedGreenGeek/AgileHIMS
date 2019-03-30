package Class_Framework.Departments;

import java.util.*;

import Class_Framework.Department;
import Class_Framework.Person;

public abstract class HCDepart extends Department{	
	protected HashSet<Person> patientSet = new HashSet<Person>();
	
	protected HashSet<Person> getPatient(){
		return patientSet;
	}
	
	protected void setPatient(HashSet<Person> patientSet) {
		this.patientSet = patientSet;
	}
}
