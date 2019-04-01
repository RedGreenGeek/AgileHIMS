package user_interface.staff_interface;

import java.util.EventObject;

public class StaffFormEvent extends EventObject {

	private String firstName;
	private String surname;
	private String adress;
	private String tribe;
	private String day;
	private String month;
	private String year;
	private String depart;
	private int jobCategory;
	
	
	public StaffFormEvent(Object source, String firstName, String surname, String adress, String tribe, String day, String month, String year, int jobCat, String depart) {
		super(source);
		
		this.firstName = firstName;
		this.surname = surname;
		this.adress = adress;
		this.tribe = tribe;
		this.day = day;
		this.month = month;
		this.year = year;
		this.jobCategory = jobCat;
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	
	public int getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(int jobCat) {
		this.jobCategory = jobCat;
	}
	

}
