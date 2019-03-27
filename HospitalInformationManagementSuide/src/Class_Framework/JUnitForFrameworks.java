package Class_Framework;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.Test;


public class JUnitForFrameworks {
	
	@Test
	public void Reg() {
		//Patient Reg:
		Patient P = new Patient();
		
		Set<Patient> tempPatientSet = Hospital.getAllPatients();
		PatientReg.add(P);
		
		
		//test if the 2 objects are the same:
		assertEquals(Hospital.getAllPatients(),tempPatientSet.add(P));
		
		
		//Staff Reg:
		Staff S = new Staff(...);
		
		Set<Staff> tempStaffList = Hospital.getAllStaff();
		StaffReg.add(S);
		
		assertEquals(Hospital.getAllStaff(),tempStaffList.add(P));
		
		
	}
	@Test
	public void Change() {
		//Patient Change:
		Patient P = new Patient(..,name="Jens");
		PatientReg.add(P);
		Set<Patient> tempPatientSet1 = Hospital.getAllPatients();

		
		//Change the name (just an example, can be anything. Remember that PatientChange is probably not correct name!)
		PatientChange(P,"Bob");
		Set<Patient> tempPatientSet2 = Hospital.getAllPatients();
		
		assertFalse(tempPatientSet1,tempPatientSet2);
		
		//Staff Change:
		Staff S = new Staff(..,name="Ole");
		StaffReg.add(S);
		Set<Staff> tempStateSet1 = Hospital.getAllStaff();

		
		//Change the name (just an example, can be anything. Remember that StaffChange is probably not correct name!)
		StaffChange(S,"Kurt");
		Set<Staff> tempStaffSet2 = Hospital.getAllStaff();
		
		assertFalse(tempStateSet1,tempStaffSet2);
		
	}
	@Test
	public void Delete() {
		//Patient Delete:
		Patient P = new Patient(...);
		
		Set<Patient> tempPatientSet = Hospital.getAllPatients();
		PatientReg.delete(P);
		
		
		//test if the 2 objects are the same:
		assertEquals(Hospital.getAllPatients(),tempPatientSet.remove(P));
		
		
		//Staff Delete:
		Staff S = new Staff(...);
		
		Set<Staff> tempStaffSet = Hospital.getAllStaff();
		StaffReg.delete(S);
		
		
		//test if the 2 objects are the same:
		assertEquals(Hospital.getAllStaff(),tempStaffSet.remove(S));
		
		
	}
	

}
