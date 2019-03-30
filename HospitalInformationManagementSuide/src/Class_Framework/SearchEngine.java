package Class_Framework;

import java.util.LinkedList;

public class SearchEngine {
	protected LinkedList<Department> department(String departmentName, LinkedList<Department> dList){
		LinkedList<Department> res = new LinkedList<Department>();
		while (!dList.isEmpty()) {
			if (dList.getFirst().getName().toLowerCase().startsWith(departmentName.toLowerCase())){
				res.add(dList.removeFirst());
			}
			else {
				dList.removeFirst();
			}
		}
		return res;
	}
	
	protected LinkedList<Person> firstName(String firstName,LinkedList<Person> sList){
		LinkedList<Person> res = new LinkedList<Person>();
		while (!sList.isEmpty()) {
			if (sList.getFirst().getFirstName().toLowerCase().startsWith(firstName.toLowerCase())) {
				res.add(sList.removeFirst());
			}
			else {
				sList.removeFirst();
			}
		}
		return res;
	}
	
	protected LinkedList<Person> lastName(String lastName,LinkedList<Person> sList){
		LinkedList<Person> res = new LinkedList<Person>();
		while (!sList.isEmpty()) {
			if (sList.getFirst().getLastName().toLowerCase().startsWith(lastName.toLowerCase())) {
				res.add(sList.removeFirst());
			}
			else {
				sList.removeFirst();
			}
		}
		return res;
	}
	
	protected LinkedList<Person> birthday(String birthday,LinkedList<Person> sList){
		LinkedList<Person> res = new LinkedList<Person>();
		while (!sList.isEmpty()) {
			if (sList.getFirst().getBirthday().toLowerCase().startsWith(birthday.toLowerCase())) {
				res.add(sList.removeFirst());
			}
			else {
				sList.removeFirst();
			}
		}
		return res;
	}
}