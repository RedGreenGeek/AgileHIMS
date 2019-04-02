package Class_Framework.Departments.HealthCare;
//
import java.util.HashSet;
import java.util.PriorityQueue;

import Class_Framework.Person;
import Class_Framework.Departments.HCDepart;
import Class_Framework.person.Patient;

public class OutPatientDepart extends HCDepart {
	class Pair implements Comparable<Pair> {
	      Person P;
	      int triageLevel;
	      
	      public Pair(Person P, int triageLevel) {
	        this.P = P;
	        this.triageLevel = triageLevel;
	      }
	      

	      public int compareTo(Pair pair) {
	        return Integer.compare(pair.triageLevel,triageLevel);
	      }
	      
	      public Person getID() {
	        return this.P;
	      }

	    }

	
	public int triageLevel;
	public Patient P;
	public PriorityQueue<Pair> queue;
	
	
	
	
	public OutPatientDepart(String departName, HashSet<Person> staffSet, HashSet<Person> patientSet) {
		super.setName(departName);
		super.setStaff(staffSet); 
		this.patientSet = patientSet;
		this.queue = new PriorityQueue<Pair>(1);
	}
	
	public void EnQueue(Person P, int triageLevel) {
		Pair p = new Pair(P,triageLevel);
		this.queue.add(p);
		
	}
	public void EnQueue(Person P) {
		Pair p = new Pair(P,1);
		this.queue.add(p);
		
	}
	public Person DeQueue() {
		return this.queue.poll().getID();
		
	}
}
