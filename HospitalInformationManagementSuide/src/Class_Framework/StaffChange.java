package Class_Framework;

import java.util.HashSet;

public class StaffChange implements ChangeRegister {
	Staff s;
	Department d;
	
	public StaffChange(Department d, Staff s) {
		this.d = d;
		this.s = s;
	}
	
	public void add() {
		HashSet<Staff> staffSet = this.d.getStaff();
		staffSet.add(s);
		this.d.setStaff(staffSet);
	}
	
	public void remove() {
		HashSet<Staff> staffSet = this.d.getStaff();
		staffSet.remove(s);
		this.d.setStaff(staffSet);
	}
}
