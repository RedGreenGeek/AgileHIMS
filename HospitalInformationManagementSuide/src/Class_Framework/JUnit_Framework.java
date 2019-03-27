package Class_Framework;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
//Hey
//asd
//
public class JUnit_Framework {
	
	@Test
	public void Reg() {
		//Patient Reg:
		//Create a hospital, with a patient set, and some random department:
		HashSet<Patient> PSet = new HashSet<Patient>();
		Department D = new HCDepart("Nurses",new HashSet<Staff>(),PSet);
		HashSet<Department> DSet = new HashSet<Department>();
		DSet.add(D);
		Hospital H = new Hospital(DSet);
		
		//Add a patient to PSet, which is the set that hospital is created from:
		Set<Patient> tempPatientSet = H.getAllPatient();
		Patient P = new Patient("Jens","a","a","",24,9,97,true);
		PSet.add(P);		
		tempPatientSet.add(P);
		//test if the 2 objects are the same:
		assertEquals(H.getAllPatient().size(),tempPatientSet.size());
		
		
		//Staff Reg:
		//Basically do the same for staff:
		Set<Staff> tempStaffList = H.getAllStaff();
		Nurse S = new Nurse("","","","",0,0,0);
		HashSet<Staff> Nurses = D.getStaff();
		Nurses.add(S);
		tempStaffList.add(S);
		D.setStaff(Nurses);
				
		assertEquals(H.getAllStaff().size(),tempStaffList.size());
		
		
	}
	@Test
	public void Change() {
		//Patient Change:
		//Create a hospital of a NurseSet (staff) and a patient set:
		Patient P = new Patient("Jens","","","",1,1,1,true);
		//Hardcode Jens to be the name:
		String string1 = "Jens";
		HashSet<Patient> PSet = new HashSet<Patient>();
		PSet.add(P);
		
		Nurse S = new Nurse("Ole","","","",0,0,0);
		String string2 = "Ole";
		HashSet<Staff> NurseSet = new HashSet<Staff>();
		NurseSet.add(S);

		Department D = new HCDepart("Nurses",NurseSet, PSet);
		HashSet<Department> DSet = new HashSet<Department>();
		DSet.add(D);
		Hospital H = new Hospital(DSet);
		
		//Change the name to Bob:
		P.setFirstName("Bob");
		
		
		//get the value of the patient from the hospital:
		Patient tempPatient=H.getAllPatient().iterator().next();
		
		//Check if jens and bob are equal names:
		assertFalse(string1.equals(tempPatient.getFirstName()));
		
		//Staff Change:
		S.setFirstName("KOO");

		Staff tempStaff=H.getAllStaff().iterator().next();
		
		assertFalse(string2.equals(tempStaff.getFirstName()));
		
	}
	@Test
	public void Delete() {
		//Patient Delete:
		Patient P = new Patient("Jens","","","",0,0,0,true);
		HashSet<Patient> PSet = new HashSet<Patient>();
		PSet.add(P);
		
		Nurse S = new Nurse("Ole","","","",0,0,0);
		S.setFirstName("Ole");
		HashSet<Staff> NurseSet = new HashSet<Staff>();
		NurseSet.add(S);


		
		Department D = new HCDepart("Nurses",NurseSet, PSet);
		HashSet<Department> DSet = new HashSet<Department>();
		DSet.add(D);
		Hospital H = new Hospital(DSet);
		
		Set<Patient> tempPatientSet = H.getAllPatient();
		
		//Try to remove from the hospital, and check if the removal is succesful:
		PSet.remove(P);
		tempPatientSet.remove(P);
		
		
		//test if the 2 objects are the same:
		assertEquals(H.getAllPatient(),tempPatientSet);
		
		
		//Staff Delete:
		
		Set<Staff> tempStaffSet = H.getAllStaff();
		NurseSet.remove(S);
		tempStaffSet.remove(S);
		
		//test if the 2 objects are the same:
		assertEquals(H.getAllStaff(),tempStaffSet);
		
		
	}
	

}
