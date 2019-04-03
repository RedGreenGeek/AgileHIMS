package Class_Framework.Departments.HealthCare_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import Class_Framework.ChangeReg;
import Class_Framework.Person;
import Class_Framework.Departments.HealthCare.InPatientDepart;
import Class_Framework.Departments.HealthCare.OutPatientDepart;
import Class_Framework.person.Patient;

class OutPatientDepartTest {

	@Test
	void test() {
		ChangeReg R = new ChangeReg();
		
		HashSet<Person> PSet = new HashSet<Person>();
		HashSet<Person> SSet = new HashSet<Person>();
		Patient P1 = new Patient("Carl","Ruby","Jagtvej 120","DTU",1,12,1996,true);
		Patient P2 = new Patient("Bob","Olesen","Jagtvej 121","DTU",1,8,1996,true);
		Patient P3 = new Patient("Jens","Olesen","Jagtvej 121","DTU",1,8,1996,true);

		OutPatientDepart D = new OutPatientDepart("Kids",SSet,PSet);

		R.add(D, P1);
		R.add(D, P2);		
		
		
		D.EnQueue(P3,10);
		Person P5 = D.DeQueue();
		assertEquals(P3,P5);
		
		assertTrue(D.PrintQueue().size() == 2);
		
		
		
		
		
		
		
		
		
		
	}

}
