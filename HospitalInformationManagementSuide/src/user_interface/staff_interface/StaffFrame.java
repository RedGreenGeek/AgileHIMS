package user_interface.staff_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Class_Framework.person.*;
import Class_Framework.person.staff.*;




public class StaffFrame extends JFrame {
	
	private StaffTextPanel textPanel;
	private StaffToolbar toolbar;
	private StaffFormPanel formPanel;
	
	
	
	
	public StaffFrame() {
		super("Add staff member");
		
		setLayout(new BorderLayout());
		
		toolbar = new StaffToolbar();
		textPanel = new StaffTextPanel();
		formPanel = new StaffFormPanel();

		toolbar.setStringListener(new StaffStringListener(){
			public void textEmitted(String text) {
				textPanel.appendText(text);	
			}			
		});
		
		formPanel.setFormListener(new StaffFormListener() {
			public void formEventOccurred(StaffFormEvent event) {
				String firstName = event.getFirstName();
				String surname = event.getSurname();
				String adress = event.getAdress();
				String tribe = event.getTribe();
				int day;
				int month;
				int year;
				try {
				day = Integer.parseInt(event.getDay());
				month = Integer.parseInt(event.getMonth());
				year = Integer.parseInt(event.getYear());
				} catch(Exception e) {day = -1; month = -1; year = -1;}
				int jobCat = event.getJobCategory();
				String depart = event.getDepart();
				Staff emp = null; 
				String dep_mes;
				try {
//				if (emp.getBirthday() == null) {
//					int[] f = new int[0];
//					f[0] = f[1];
//				}
				if(jobCat == 0) {
					emp = new Nurse(firstName, surname, adress, tribe, day, month, year);
//					api_message = APIFunctionAddStaff(username,password_hash,String department,emp);
				}
				else if(jobCat == 1) {
					emp = new Doctor(firstName, surname, adress, tribe, day, month, year);
				}
				else if(jobCat == 2) {
					emp = new Clerk(firstName, surname, adress, tribe, day, month, year);
				}
				else if(jobCat == 3) {
					emp = new ITCOfficer(firstName, surname, adress, tribe, day, month, year);
				}
				
				textPanel.appendText("A new " + emp.getJobType() + " has been added to the hospital. \n" + 
				"First name: " + emp.getFirstName() + " \n" + 
				"Surname: " + emp.getLastName() + "\n" +
				"Adress: " + emp.getAdress() + "\n" +
				"Tribe: " + emp.getTribe() + "\n" +
				"Birthday: " + emp.getBirthday() + "\n" +
				"ID number: " + emp.getID() + "\n" + 
				"email: " + emp.getEmail() + "\n" + // email skal lige sortere mellemrum fra i class staff.
				"Department: " + depart);
				textPanel.appendText("\n");
				}
				catch(Exception e) {
					textPanel.appendText("Wrong input. \n");
				}
			}
				
			
		});
		
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
