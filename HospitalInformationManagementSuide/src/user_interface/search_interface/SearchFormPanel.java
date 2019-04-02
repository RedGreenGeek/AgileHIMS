package user_interface.search_interface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import user_interface.staff_interface.StaffFrame;

public class SearchFormPanel extends JPanel {
	
	private JLabel firstNameLabel;
	private JLabel surnameLabel;
	
	private JLabel birthdayLabel;
	
	private JTextField firstNameField;
	private JTextField surnameField;
	
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private SearchTextPrompt dayGhost;
	private SearchTextPrompt monthGhost;
	private SearchTextPrompt yearGhost;
	private JButton okBtn;
	private SearchFormListener formListener;

	private JLabel emailLabel;
	private JTextField emailField;
	private JRadioButton staffBtn;
	private JRadioButton patientBtn;
	private ButtonGroup personGroup;
	
	
	
	
	
	
	public SearchFormPanel() {
		Dimension dim = getPreferredSize();
		
		dim.width = 250;
		setPreferredSize(dim);
		
		firstNameLabel = new JLabel("First name: ");
		surnameLabel = new JLabel("Surname: ");
		
		birthdayLabel = new JLabel("Birthday: ");

		firstNameField = new JTextField(11);
		surnameField = new JTextField(11);
		
		dayField = new JTextField(3);
		monthField = new JTextField(3);
		yearField = new JTextField(4);
		dayGhost = new SearchTextPrompt("Day", dayField);
		monthGhost = new SearchTextPrompt("Month", monthField);
		yearGhost = new SearchTextPrompt("Year", yearField);
		emailLabel = new JLabel("email: ");
		emailField = new JTextField(10);
		staffBtn = new JRadioButton("Staff");
		patientBtn = new JRadioButton("Patient");
		personGroup = new ButtonGroup();
		
		// set up person group
		personGroup.add(staffBtn);
		personGroup.add(patientBtn);
		
		// set up email field
		emailLabel.setEnabled(false);
		emailField.setEnabled(false);
		
		staffBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isTicked = staffBtn.isSelected();
				emailLabel.setEnabled(isTicked);
				emailField.setEnabled(isTicked);
			}
		});
		
		patientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isTicked = patientBtn.isSelected();
				emailLabel.setEnabled(!isTicked);
				emailField.setEnabled(!isTicked);
				emailField.setText("");
			}
		});
		
		
		
		okBtn = new JButton("Search");
		
		okBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				String firstName = firstNameField.getText();
				String surname = surnameField.getText();
				String day = dayField.getText();
				String month = monthField.getText();
				String year = yearField.getText();
				String email = emailField.getText();
				firstNameField.setText("");
				surnameField.setText("");
				dayField.setText("");
				monthField.setText("");
				yearField.setText("");
				emailField.setText("");
				
				
				SearchFormEvent ev = new SearchFormEvent(this, firstName, surname, day, month, year, email);
				
				if (formListener != null) {
					formListener.formEventOccurred(ev);
				}
;			}
			
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("Search after patient or staff");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		layoutComponents();

		
	} // her ender constructoren
	
	
	public void layoutComponents() {
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		/////////////////////////////////// 1. linje
		gc.gridy=0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,5);
		
		add(staffBtn, gc);
		
		gc.gridx = 1;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(patientBtn, gc);
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(firstNameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(firstNameField, gc);
		
		///////////////////////////// 2. linje
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		
		add(surnameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(surnameField, gc);
		/////////////////////////// 3. linje
		

		
		/////////////////////////// 4. linje
		/////////////////////////// 5. linje
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 0.1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(birthdayLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(dayField, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,38,0,0);
		
		add(monthField, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,76,0,0);
		
		add(yearField, gc);
		
		/////////////////////////// 6. linje
		

		
		/////////////////////////// 7. linje
	
		
	
		
		/////////////////////////// 8. linje
		

		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(emailLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(emailField, gc);
		
		
		/////////////////////////// 10. linje
		
		gc.gridx = 1;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(okBtn, gc);
	}

	public void setFormListener(SearchFormListener listener) {
		this.formListener = listener;
	}
		
	
}





