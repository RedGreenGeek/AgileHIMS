package Class_Framework;

import java.util.HashSet;

public class DepartmentChange implements ChangeRegister {
	Hospital h;
	Department d;
	
	public DepartmentChange(Hospital h, Department d) {
		this.h = h;
		this.d = d;
	}
	
	public void add() {
		HashSet<Department> departSet = this.h.getDepartSet();
		departSet.add(this.d);
		this.h.setDepartSet(departSet);
	}
	
	public void remove() {
		HashSet<Department> departSet = this.h.getDepartSet();
		departSet.remove(this.d);
		this.h.setDepartSet(departSet);
	}
}
