package Class_Framework.Password;
import Class_Framework.Clerk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import Class_Framework.Doctor;

class JUnit_Password {
	Password P = new Password();
	Clerk C2 = new Clerk("a","b","c","d",1,10,1998);
	Doctor D = new Doctor("a","b","c","d",1,10,1998); 
	Clerk C1 = new Clerk("q","s","b","os",1,10,1998);
	Scanner S = new Scanner(System.in);
	@Test
	void PassTests() {
		
		C2.setPassword(P);
		C1.setPassword(P,"Password1234");
		
		assertTrue(P.checkPassword("Password1234", C1.getID()));
		assertFalse(P.checkPassword(null, "asydhuiasdoi"));
		assertFalse(P.checkPassword("AwrongPassword", C1.getID()));

		System.out.println("Enter Password");
		String pass = S.nextLine();
		C2.setPassword(P,pass);	
		assertTrue(P.checkPassword(pass,C2.getID()));
		
		
	}

}
