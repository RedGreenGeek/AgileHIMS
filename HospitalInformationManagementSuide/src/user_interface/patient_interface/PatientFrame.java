package user_interface.patient_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Class_Framework.person.*;
import Class_Framework.person.staff.*;




public class PatientFrame extends JFrame {
	
	private PatientTextPanel textPanel;
	private PatientToolbar toolbar;
	private PatientFormPanel formPanel;
	
	
	
	
	public PatientFrame() {
		super("Add patient");
		
		setLayout(new BorderLayout());
		
		toolbar = new PatientToolbar();
		textPanel = new PatientTextPanel();
		formPanel = new PatientFormPanel();

		toolbar.setStringListener(new PatientStringListener(){
			public void textEmitted(String text) {
				textPanel.appendText(text);	
			}			
		});
		
		formPanel.setFormListener(new PatientFormListener() {
			public void formEventOccurred(PatientFormEvent event) {
				String firstName = event.getFirstName();
				String surname = event.getSurname();
				String adress = event.getAdress();
				String tribe = event.getTribe();
				int day = Integer.parseInt(event.getDay());
				int month = Integer.parseInt(event.getMonth());
				int year = Integer.parseInt(event.getYear());
				String depart = event.getDepart();
				Patient patient = null; 
				String dep_mes;
				try {
//				if (emp.getBirthday() == null) {
//					int[] f = new int[0];
//					f[0] = f[1];
//				}
				
					patient = new Patient(firstName, surname, adress, tribe, day, month, year, true);
//					api_message = APIFunctionAddStaff(username,password_hash,String department,emp);
				

				
				textPanel.appendText("A new patient with ID " + patient.getPatientID() + " has been added to the hospital. \n" + 
				"First name: " + patient.getFirstName() + " \n" + 
				"Surname: " + patient.getLastName() + "\n" +
				"Adress: " + patient.getAdress() + "\n" +
				"Tribe: " + patient.getTribe() + "\n" +
				"Birthday: " + patient.getBirthday() + "\n" +
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
