package Class_Framework;

import java.util.HashSet;

public class CreateHospital {
	static Hospital H;
	
	CreateHospital() {
		HashSet<Patient> PSet1 = new HashSet<Patient>();

		HashSet<Staff> SSet1 = new HashSet<Staff>();
		HashSet<Staff> SSet2 = new HashSet<Staff>();
		
		Patient P1 = new Patient("Ole","Hansen","Øster","Menneske",24,10,97,true);
		Patient P2 = new Patient("Jens","Olsen","Vester","Menneske",24,11,97,true);
		Patient P3 = new Patient("Bob","Efternavn","Nørre","Menneske",12,9,97,true);
		Patient P4 = new Patient("Hans","Syde","Syd","Menneske",20,4,97,true);
		Patient P5 = new Patient("Mads","Ostebolle","NV","Menneske",12,8,96,true);
		Patient P6 = new Patient("Jørgen","Keikre","ØV","Menneske",15,5,97,true);
		
		Staff Clerk1 = new Clerk("Mads","hansen","Uganda","Black-rocks Clan",23,4,2000);
		Staff Clerk2 = new Clerk("Karl","Johnson","Uganda","Black-rocks Clan",23,4,1904);
		Staff Doctor1 = new Doctor("Mathias","Søndergaard","Uganda","Black-rocks Clan",25,3,1902);
		Staff Doctor2 = new Doctor("Anton","Ruby","Uganda","Black-rocks Clan",20,4,1997);
		Staff ITCOfficer1 = new ITCOfficer("Ole","christiansen","Denmark","Black-rocks Clan",23,4,2000);
		Staff ITCOfficer2 = new ITCOfficer("John","olegårdsen","??","Black-rocks Clan",3,1,1954);


		PSet1.add(P1);
		PSet1.add(P2);
		PSet1.add(P3);
		PSet1.add(P4);
		PSet1.add(P5);
		PSet1.add(P6);
		SSet1.add(Clerk1);
		SSet1.add(Doctor1);
		SSet1.add(ITCOfficer1);
		SSet2.add(Clerk2);
		SSet2.add(Doctor2);
		SSet2.add(ITCOfficer2);

		
		Department HCDep = new HCDepart("Cancer",SSet1,PSet1);
		Department ACDep = new AdminDepart("Doctors",SSet2);
		HashSet<Department> DSet = new HashSet<Department>();
		DSet.add(HCDep);
		DSet.add(ACDep);
		
		this.H = new Hospital(DSet);



	
		
	}
	Hospital ReturnHos() {
		return H;
	}
	public static void main(String args[]) {
		H = (new CreateHospital()).ReturnHos();
		System.out.println(H.getDepartSet());
		System.out.println(H.getAllPatient());
	
	}

}
