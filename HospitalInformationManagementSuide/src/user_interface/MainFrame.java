package user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Class_Framework.*;


public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	
	
	
	public MainFrame() {
		super("Add staff member");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();

		toolbar.setStringListener(new StringListener(){
			public void textEmitted(String text) {
				textPanel.appendText(text);	
			}			
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent event) {
				String firstName = event.getFirstName();
				String surname = event.getSurname();
				String adress = event.getAdress();
				String tribe = event.getTribe();
				int day = Integer.parseInt(event.getDay());
				int month = Integer.parseInt(event.getMonth());
				int year = Integer.parseInt(event.getYear());
				int jobCat = event.getJobCategory();
				String empCat = event.getEmployment();
				Staff emp = null; 
				
				if(jobCat == 0) {
					emp = new Nurse(firstName, surname, adress, tribe, day, month, year);
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
				"email: " + emp.getEmail() + "\n");
				textPanel.appendText("\n");
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
