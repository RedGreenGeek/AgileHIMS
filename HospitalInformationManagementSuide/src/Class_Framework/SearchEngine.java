package Class_Framework;

import java.util.LinkedList;

public class SearchEngine {
	protected LinkedList<Person> firstName(String firstName,LinkedList<Person> sList){
		LinkedList<Person> res = new LinkedList<Person>();
		while (!sList.isEmpty()) {
			if (sList.getFirst().getFirstName().equals(firstName)) {
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
			if (sList.getFirst().getLastName().equals(lastName)) {
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
			if (sList.getFirst().getBirthday().equals(birthday)) {
				res.add(sList.removeFirst());
			}
			else {
				sList.removeFirst();
			}
		}
		return res;
	}
}
