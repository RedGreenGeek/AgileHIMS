package Class_Framework.Password;
import Class_Framework.person.staff.Clerk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import Class_Framework.person.staff.Doctor;

class JUnit_Password {
	Password P = new Password();
	Clerk C2 = new Clerk("a","b","c","d",1,10,1998);
	Doctor D = new Doctor("a","b","c","d",1,10,1998); 
	Clerk C1 = new Clerk("q","s","b","os",1,10,1998);
	@Test
	void PassTests() {
		
		C2.setPassword(P);
		C1.setPassword(P,"Password1234");
		D.setPassword(P);
		
		assertTrue(P.checkPassword("Password1234", C1.getID()));
		assertFalse(P.checkPassword(null, "asydhuiasdoi"));
		assertFalse(P.checkPassword("AwrongPassword", C1.getID()));

		String pass = "asd";
		C2.setPassword(P,pass);	
		assertTrue(P.checkPassword(pass,C2.getID()));
		
		
	}

}
