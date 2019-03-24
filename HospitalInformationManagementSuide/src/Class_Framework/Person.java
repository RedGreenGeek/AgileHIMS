package Class_Framework;

import java.util.*;

public abstract class Person {
		
	private String firstName;
	private String lastName;
	private Calendar birthday;
	private String adress;
	private String tribe;
	private boolean alive;
	
	public String getAdress() {
		return this.adress;
	}
	
	protected void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getTribe() {
		return this.tribe;
	}
	
	protected void setTribe(String tribe) {
		this.tribe = tribe;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	protected void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	protected void setBirthDay(int day, int month, int year){
	 this.birthday.set(year, month-1, day);
	}
	
	public Calendar getBirthDay(){
		return this.birthday;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	protected void setFirstName(String name) {
		this.firstName = name;
	}
	
	protected void setLastName(String name) {
		this.lastName = name;
	}

}
