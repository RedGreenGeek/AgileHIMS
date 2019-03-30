package Class_Framework.Password;
import java.util.HashMap;


public class Password {
	private HashMap<String, String> PassMap;
	
	public Password() {
		this.PassMap = new HashMap<String,String>();		
	}
	
	public void addPassToMap(String Pass, String StaffId) {
		this.PassMap.put(StaffId,Pass);
	}

	
	protected boolean checkPassword(String EnterPass, String StaffId) {
		if (EnterPass == null) {
			System.out.println("Do NOT try to hack the passwords");
			return false;
		}
		if (this.PassMap.get(StaffId) == EnterPass) {
			System.out.println("Acces granted");
			return true;
		}
		
		else {
		System.out.println("Acces DENIED!!!");
		return false;}
	}
	
	
	
}
