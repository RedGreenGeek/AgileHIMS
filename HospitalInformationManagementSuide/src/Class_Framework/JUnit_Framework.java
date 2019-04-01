//package Class_Framework;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.HashSet;
//import java.util.Set;
//import org.junit.jupiter.api.Test;
//
//public class JUnit_Framework {
//	
//	@Test
//	public void Reg() {
//		//Patient Reg:
//		//Create a hospital, with a patient set, and some random department:
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		Department D = new InPatientDepart("Nurses",new HashSet<Staff>(),PSet,7);
//		HashSet<Department> DSet = new HashSet<Department>();
//		DSet.add(D);
//		Hospital H = new Hospital(DSet);
//		
//		//Added an admin department
//		
//		Staff ITCOf = new ITCOfficer("Jens","Hansen","Norway","Indian",29,2,1996);
//		Staff Clerk = new Clerk("Mads","hansen","Uganda","Black-rocks Clan",23,4,2000);
//		HashSet<Staff> ITCSet = new HashSet<Staff>();
//		ITCSet.add(ITCOf);
//		ITCSet.add(Clerk);
//		AdminDepart A = new AdminDepart("Even more smart people",ITCSet);
//		ChangeReg R = new ChangeReg();
//		R.add(H,A);
//		//Add a patient to PSet, which is the set that hospital is created from:
//		Set<Person> tempPatientSet = H.getAllPatient();
//		Patient P = new Patient("Jens","a","a","",24,9,97,true);
//		PSet.add(P);		
//		tempPatientSet.add(P);
//		//test if the 2 objects are the same:
//		assertEquals(H.getAllPatient().size(),tempPatientSet.size());
//		
//		
//		//Staff Reg:
//		//Basically do the same for staff:
////		Set<Person> tempStaffList = H.getAllStaff();
//		Nurse S = new Nurse("","","","",0,0,0);
//		HashSet<Staff> Nurses = D.getStaff();
//		Nurses.add(S);
//		tempStaffList.add(S);
//		D.setStaff(Nurses);
//				
//		assertEquals(H.getAllStaff().size(),tempStaffList.size());
//		
//		
//	}
//	@Test
//	public void Change() {
//		//Patient Change:
//		//Create a hospital of a NurseSet (staff) and a patient set:
//		Patient P = new Patient("Jens","","","",1,1,1,true);
//		//Hardcode Jens to be the name:
//		String string1 = "Jens";
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		PSet.add(P);
//		
//		Nurse S = new Nurse("Ole","","","",0,0,0);
//		String string2 = "Ole";
//		HashSet<Staff> NurseSet = new HashSet<Staff>();
//		NurseSet.add(S);
//
//		Department D = new InPatientDepart("Nurses",NurseSet, PSet,9);
//		HashSet<Department> DSet = new HashSet<Department>();
//		DSet.add(D);
//		Hospital H = new Hospital(DSet);
//		
//		//Change the name to Bob:
//		P.setFirstName("Bob");
//		
//		
//		//get the value of the patient from the hospital:
//		Person tempPatient=H.getAllPatient().iterator().next();
//		
//		//Check if jens and bob are equal names:
//		assertFalse(string1.equals(tempPatient.getFirstName()));
//		
//		//Staff Change:
//		S.setFirstName("KOO");
//
//		Person tempStaff=H.getAllStaff().iterator().next();
//		
//		assertFalse(string2.equals(tempStaff.getFirstName()));
//		
//	}
//	@Test
//	public void Delete() {
//		//Patient Delete:
//		Patient P = new Patient("Jens","","","",0,0,0,true);
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		PSet.add(P);
//		
//		Nurse S = new Nurse("Ole","","","",0,0,0);
//		S.setFirstName("Ole");
//		HashSet<Staff> NurseSet = new HashSet<Staff>();
//		NurseSet.add(S);
//
//
//		
//		Department D = new InPatientDepart("Nurses",NurseSet, PSet,8);
//		HashSet<Department> DSet = new HashSet<Department>();
//		DSet.add(D);
//		Hospital H = new Hospital(DSet);
//		
//		Set<Person> tempPatientSet = H.getAllPatient();
//		
//		//Try to remove from the hospital, and check if the removal is succesful:
//		PSet.remove(P);
//		tempPatientSet.remove(P);
//		
//		
//		//test if the 2 objects are the same:
//		assertEquals(H.getAllPatient(),tempPatientSet);
//		
//		
//		//Staff Delete:
//		
////		Set<Person> tempStaffSet = H.getAllStaff();
//		NurseSet.remove(S);
//		tempStaffSet.remove(S);
//		
//		//test if the 2 objects are the same:
//		assertEquals(H.getAllStaff(),tempStaffSet);
//		
//		
//	}
//	@Test
//	public void ChangeRegHospital() {
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		Department D = new InPatientDepart("Nurses",new HashSet<Staff>(),PSet,32);
//		Department D2 = new InPatientDepart("Doctor",new HashSet<Staff>(),PSet,34);
//
//		HashSet<Department> DSet = new HashSet<Department>();
//		DSet.add(D);
//		Hospital H = new Hospital(DSet);
//		DSet.add(D2);
//		Hospital H2 = new Hospital(DSet);
//		
//		ChangeReg R = new ChangeReg();
//		
//		R.remove(H2,D2);
//		
//		assertEquals(H.getDepartSet(),H2.getDepartSet());
//		
//		R.add(H2, D2);
//		Hospital H3 = new Hospital(DSet);
//		
//		assertEquals(H2.getDepartSet(),H3.getDepartSet());
//
//		
//	}
//	@Test public void ChangeRegStaff() {
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		HashSet<Staff> SSet = new HashSet<Staff>();
//		Department D = new InPatientDepart("Doctors",SSet,PSet,5);
//		
//		ChangeReg R = new ChangeReg();
//		Staff Doc = new Doctor("Anton","Ruby","Jagtvej 120","DTU",1,12,1996);
//		R.add(D, Doc);
//		
//		HashSet<Staff> SSet2 = new HashSet<Staff>();
//		Department D2 = new InPatientDepart("Doctors",SSet2,PSet,6);
//		SSet2.add(Doc);
//		
//		assertEquals(D2.getStaff(),(D.getStaff()));
//		
//		R.remove(D, Doc);
//		
//		Department D3 = new InPatientDepart("Doctors",new HashSet<Staff>(), new HashSet<Patient>(),5);
//		
//		assertEquals(D.getStaff(),(D3.getStaff()));
//
//	}
//		
//	@Test public void ChangeRegPatient() {
//		HashSet<Patient> PSet = new HashSet<Patient>();
//		HashSet<Staff> SSet = new HashSet<Staff>();
//		Department D = new InPatientDepart("Kids",SSet,PSet,65);
//		
//		ChangeReg R = new ChangeReg();
//		Patient P1 = new Patient("Carl","Ruby","Jagtvej 120","DTU",1,12,1996,true);
//		PSet.add(P1);
//		
//		
//		HashSet<Patient> PSet2 = new HashSet<Patient>();
//		Department D2 = new InPatientDepart("Men",SSet,PSet2,1005);
//		R.add(D2,P1);
//		
//		
//		assertEquals(D2.getPatient(), D.getPatient());
//		
//		
//		R.remove(D, P1);
//		
//		Department D3 = new InPatientDepart("Doctors",new HashSet<Staff>(), new HashSet<Patient>(),42);
//		
//		assertEquals(D.getPatient(),(D3.getPatient()));
//		
//	}
//	@Test
//	public void MiscTests() {
//		Staff ITCOf = new ITCOfficer("Jens","Hansen","Norway","Indian",29,2,1996);
//		Staff Clerk = new Clerk("Mads","hansen","Uganda","Black-rocks Clan",23,4,2000);
//		Patient P1 = new Patient("Jøregen","Uolko","Øster Søgade 5678","Søernes forening",24,9,1997,true);
//		HashSet<Staff> ITCSet = new HashSet<Staff>();
//		P1.getPatientID();
//		ITCSet.add(ITCOf);
//		AdminDepart ADepart = new AdminDepart("Smart people",ITCSet);
//		ChangeReg R = new ChangeReg();
//		
//		R.add(ADepart, Clerk);
//		R.add(ADepart, P1);
//		ITCSet.add(Clerk);
//		AdminDepart ADepart2 = new AdminDepart("Even more smart people",ITCSet);
//		
//		
//		assertEquals(Clerk.getAdress(),"Uganda");
//		assertEquals(Clerk.getTribe(),"Black-rocks Clan");
//		assertEquals(P1.isAlive(),true);
//		assertEquals(Clerk.getJobType(),"Clerk");
//		assertEquals(ITCOf.getBirthday(),"29-02-1996");
//		ITCOf.getID();
//		System.out.println(ITCOf.getEmail());
//		
//		
//
//		
//		
//	}
//		
//
//		
//		
//		
//		
//		
//		
//		
//	}
//	
//
//
