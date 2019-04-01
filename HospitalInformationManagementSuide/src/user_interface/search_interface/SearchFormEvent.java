package user_interface.search_interface;

import java.util.EventObject;

public class SearchFormEvent extends EventObject {

	private String FirstName;
	private String surname;
	private String adress;
	private String id;
	private String day;
	private String month;
	private String year;
	private int jobCategory;
	private String email;
	
	public SearchFormEvent(Object source, String FirstName, String surname, String adress, String id, String day, String month, String year, int jobCat, String email) {
		super(source);
		
		this.FirstName = FirstName;
		this.surname = surname;
		this.adress = adress;
		this.id = id;
		this.day = day;
		this.month = month;
		this.year = year;
		this.jobCategory = jobCat;
		this.email = email;
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
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
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
	

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(int jobCat) {
		this.jobCategory = jobCat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
