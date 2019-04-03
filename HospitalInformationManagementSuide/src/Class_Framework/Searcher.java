package Class_Framework;

import java.util.LinkedList;

public class Searcher {
	static Searcher s;
	static Hospital h;
	private SearchEngine se = new SearchEngine();
	
	public static synchronized Searcher getInstance(Hospital hos) {
		if (s == null || h == null) {
			s = new Searcher(hos);
		}
		return s;
	}
	
	private Searcher(Hospital hos) {
		h = hos;
	}
	
	protected LinkedList<Department> departmentSearch(String departmentName){
		LinkedList<Department> dList = new LinkedList<Department>(h.getDepartSet());
		return se.department(departmentName, dList);
	}
	
	protected LinkedList<Person> patientSearch(String firstName, String lastName, String birthday) {
		LinkedList<Person> pList = new LinkedList<Person>(h.getAllPatient());
		if (!birthday.equals("")) {
			pList = se.birthday(birthday, pList);
		}
		if (!lastName.equals("")) {
			pList = se.lastName(lastName, pList);
		}
		if (!firstName.equals("")) {
			pList = se.firstName(firstName, pList);
		}
		return pList;		
	}
	
	protected LinkedList<Person> staffSearch(String firstName, String lastName, String birthday,String email) {
		LinkedList<Person> pList = new LinkedList<Person>(h.getAllStaff());
		if (!email.equals("")) {
			pList = se.email(email,pList);
		}
		if (!birthday.equals("")) {
			pList = se.birthday(birthday, pList);
		}
		if (!lastName.equals("")) {
			pList = se.lastName(lastName, pList);
		}
		if (!firstName.equals("")) {
			pList = se.firstName(firstName, pList);
		}
		return pList;		
	}
}
