package Class_Framework.Departments.HealthCare_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import Class_Framework.Department;
import Class_Framework.Person;
import Class_Framework.Departments.HCDepart;
import Class_Framework.Departments.HealthCare.InPatientDepart;
import Class_Framework.person.Patient;

class BedsInUseTest {

	@Test
	void test() {
		HashSet<Person> PSet = new HashSet<Person>();
		HashSet<Person> SSet = new HashSet<Person>();
		Patient P1 = new Patient("Carl","Ruby","Jagtvej 120","DTU",1,12,1996,true);
		Patient P2 = new Patient("Bob","Olesen","Jagtvej 121","DTU",1,8,1996,true);
		Patient P3 = new Patient("Jens","Olesen","Jagtvej 121","DTU",1,8,1996,true);

		InPatientDepart D = new InPatientDepart("Kids",SSet,PSet,65);
		D.beds.AllocateBed(P1);
		D.beds.AllocateBed(P2,5);
		D.beds.AllocateBed(P3,5);
		D.beds.Discharge(5);
		assertTrue(D.beds.getMaxBeds()==65);
		assertEquals(D.beds.getBedsInUse(),1);
		D.beds.setBedsInUse(10);
		assertTrue(D.beds.getBedsInUse()==10);
		assertTrue(D.beds.getBedsAvailable());
		
		
		
		
		

		
		
		

		
	}

}
