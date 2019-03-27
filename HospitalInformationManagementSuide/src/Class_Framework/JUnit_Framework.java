package Class_Framework;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
//Hey
//asd
//asd
//aas
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
	@Test
	public void ChangeRegHospital() {
		HashSet<Patient> PSet = new HashSet<Patient>();
		Department D = new HCDepart("Nurses",new HashSet<Staff>(),PSet);
		Department D2 = new HCDepart("Doctor",new HashSet<Staff>(),PSet);

		HashSet<Department> DSet = new HashSet<Department>();
		DSet.add(D);
		Hospital H = new Hospital(DSet);
		DSet.add(D2);
		Hospital H2 = new Hospital(DSet);
		
		ChangeReg R = new ChangeReg();
		
		R.remove(H2,D2);
		
		assertEquals(H.getDepartSet(),H2.getDepartSet());
		
		R.add(H2, D2);
		Hospital H3 = new Hospital(DSet);
		
		assertEquals(H2.getDepartSet(),H3.getDepartSet());

		
	}
	@Test public void ChangeRegStaff() {
		HashSet<Patient> PSet = new HashSet<Patient>();
		HashSet<Staff> SSet = new HashSet<Staff>();
		Department D = new HCDepart("Doctors",SSet,PSet);
		
		ChangeReg R = new ChangeReg();
		Staff Doc = new Doctor("Anton","Ruby","Jagtvej 120","DTU",1,12,1996);
		R.add(D, Doc);
		
		HashSet<Staff> SSet2 = new HashSet<Staff>();
		Department D2 = new HCDepart("Doctors",SSet2,PSet);
		SSet2.add(Doc);
		
		assertEquals(D2.getStaff(),(D.getStaff()));
		
		R.remove(D, Doc);
		
		Department D3 = new HCDepart("Doctors",new HashSet<Staff>(), new HashSet<Patient>());
		
		assertEquals(D.getStaff(),(D3.getStaff()));

	}
		
	@Test public void ChangeRegPatient() {
		HashSet<Patient> PSet = new HashSet<Patient>();
		HashSet<Staff> SSet = new HashSet<Staff>();
		Department D = new HCDepart("Kids",SSet,PSet);
		
		ChangeReg R = new ChangeReg();
		Patient P1 = new Patient("Carl","Ruby","Jagtvej 120","DTU",1,12,1996,true);
		PSet.add(P1);
		
		
		HashSet<Patient> PSet2 = new HashSet<Patient>();
		Department D2 = new HCDepart("Men",SSet,PSet2);
		R.add(D2,P1);
		
		
		assertEquals(D2.getPatient(), D.getPatient());
		
		
		R.remove(D, P1);
		
		Department D3 = new HCDepart("Doctors",new HashSet<Staff>(), new HashSet<Patient>());
		
		assertEquals(D.getPatient(),(D3.getPatient()));
		
	}
		

		
		
		
		
		
		
		
	}
	


