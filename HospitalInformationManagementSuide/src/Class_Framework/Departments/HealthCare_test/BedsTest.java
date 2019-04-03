package Class_Framework.Departments.HealthCare_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import Class_Framework.ChangeReg;
import Class_Framework.Department;
import Class_Framework.Person;
import Class_Framework.Departments.HCDepart;
import Class_Framework.Departments.HealthCare.InPatientDepart;
import Class_Framework.person.Patient;

class BedsTest {

	@Test
	void test() {
		ChangeReg R = new ChangeReg();
		
		HashSet<Person> PSet = new HashSet<Person>();
		HashSet<Person> SSet = new HashSet<Person>();
		Patient P1 = new Patient("Carl","Ruby","Jagtvej 120","DTU",1,12,1996,true);
		Patient P2 = new Patient("Bob","Olesen","Jagtvej 121","DTU",1,8,1996,true);
		Patient P3 = new Patient("Jens","Olesen","Jagtvej 121","DTU",1,8,1996,true);
		Patient P4 = new Patient("asd","Olesen","Jagtvej 121","DTU",1,8,1996,true);

		InPatientDepart D = new InPatientDepart("Kids",SSet,PSet,65);

		R.add(D, P1);
		R.add(D, P2);
		
		
		
		assertEquals(D.beds.getBedsInUse(),2);
		D.beds.AllocateBed(P3,25);
		D.beds.AllocateBed(P4,25);
		D.beds.Discharge(P3);	
		D.beds.AllocateBed(P4,30);
		D.beds.Discharge(30);
		

		
		
		assertTrue(D.beds.getMaxBeds()==65);
		assertEquals(D.beds.getBedsInUse(),2);
		D.beds.setBedsInUse(10);
		assertTrue(D.beds.getBedsInUse()==10);
		assertTrue(D.beds.getBedsAvailable());
		
		

		

		
	}

}
