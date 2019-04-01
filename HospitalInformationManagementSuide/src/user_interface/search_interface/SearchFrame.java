package user_interface.search_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Class_Framework.*;


public class SearchFrame extends JFrame {
	
	private SearchTextPanel textPanel;
	private SearchToolbar toolbar;
	private SearchFormPanel formPanel;
	
	
	
	
	public SearchFrame() {
		super("Add staff member");
		
		setLayout(new BorderLayout());
		
		toolbar = new SearchToolbar();
		textPanel = new SearchTextPanel();
		formPanel = new SearchFormPanel();

		toolbar.setStringListener(new SearchStringListener(){
			public void textEmitted(String text) {
				textPanel.appendText(text);	
			}			
		});
		
		formPanel.setFormListener(new SearchFormListener() {
			public void formEventOccurred(SearchFormEvent event) {
				String firstName = event.getFirstName();
				String surname = event.getSurname();
				String adress = event.getAdress();
				String id = event.getId();
				try {
				int day = Integer.parseInt(event.getDay());
				int month = Integer.parseInt(event.getMonth());
				int year = Integer.parseInt(event.getYear());
				} catch( Exception e) {}
				int jobCat = event.getJobCategory();
				String email = event.getEmail();
				
				
//				if(jobCat == 0) {
//					emp = new Nurse(firstName, surname, adress, tribe, day, month, year);
//				}
//				else if(jobCat == 1) {
//					emp = new Doctor(firstName, surname, adress, tribe, day, month, year);
//				}
//				else if(jobCat == 2) {
//					emp = new Clerk(firstName, surname, adress, tribe, day, month, year);
//				}
//				else if(jobCat == 3) {
//					emp = new ITCOfficer(firstName, surname, adress, tribe, day, month, year);
//				}
//				
				textPanel.appendText(firstName + email + jobCat + id);
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
