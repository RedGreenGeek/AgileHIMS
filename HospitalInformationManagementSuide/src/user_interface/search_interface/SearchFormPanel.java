package user_interface.search_interface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class SearchFormPanel extends JPanel {
	
	private JLabel firstNameLabel;
	private JLabel surnameLabel;
	private JLabel adressLabel;
	private JLabel idLabel;
	private JLabel birthdayLabel;
	private JLabel jobLabel;
	private JTextField firstNameField;
	private JTextField surnameField;
	private JTextField adressField;
	private JTextField idField;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private SearchTextPrompt dayGhost;
	private SearchTextPrompt monthGhost;
	private SearchTextPrompt yearGhost;
	private JButton okBtn;
	private SearchFormListener formListener;
	private JComboBox jobCombo;
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
		adressLabel = new JLabel("Adress: ");
		idLabel = new JLabel("ID: ");
		birthdayLabel = new JLabel("Birthday: ");
		jobLabel = new JLabel("Job type: ");
		firstNameField = new JTextField(11);
		surnameField = new JTextField(11);
		adressField = new JTextField(11);
		idField = new JTextField(11);
		dayField = new JTextField(3);
		monthField = new JTextField(3);
		yearField = new JTextField(4);
		dayGhost = new SearchTextPrompt("Day", dayField);
		monthGhost = new SearchTextPrompt("Month", monthField);
		yearGhost = new SearchTextPrompt("Year", yearField);
		jobCombo = new JComboBox();
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
		jobCombo.setEnabled(false);
		jobLabel.setEnabled(false);
		
		staffBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isTicked = staffBtn.isSelected();
				emailLabel.setEnabled(isTicked);
				emailField.setEnabled(isTicked);
				jobCombo.setEnabled(isTicked);
				jobLabel.setEnabled(isTicked);
			}
		});
		
		patientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isTicked = patientBtn.isSelected();
				emailLabel.setEnabled(!isTicked);
				emailField.setEnabled(!isTicked);
				jobCombo.setEnabled(!isTicked);
				jobLabel.setEnabled(!isTicked);
				jobCombo.setSelectedIndex(0);
				emailField.setText("");
			}
		});
		
		// Set-up for JList
		DefaultComboBoxModel jobModel = new DefaultComboBoxModel();
		jobModel.addElement(new JobCategory(0, ""));
		jobModel.addElement(new JobCategory(1, "Nurse"));
		jobModel.addElement(new JobCategory(2, "Doctor"));
		jobModel.addElement(new JobCategory(3, "Clerk"));
		jobModel.addElement(new JobCategory(4, "ITC Officer"));
		jobCombo.setModel(jobModel);
		
		jobCombo.setPreferredSize(new Dimension(100, 25));
		jobCombo.setBorder(BorderFactory.createEtchedBorder());
		
		
		okBtn = new JButton("Search");
		
		okBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				String firstName = firstNameField.getText();
				String surname = surnameField.getText();
				String adress = adressField.getText();
				String tribe = idField.getText();
				String day = dayField.getText();
				String month = monthField.getText();
				String year = yearField.getText();
				String email = emailField.getText();
				

				JobCategory jobCat = (JobCategory) jobCombo.getSelectedItem();
				
				
				SearchFormEvent ev = new SearchFormEvent(this, firstName, surname, adress, tribe, day, month, year, jobCat.getID(), email);
				
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
		
		gc.gridx = 0;
		gc.gridy = 0;
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
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(adressLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(adressField, gc);
		
		/////////////////////////// 4. linje
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(idLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(idField, gc);
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
		
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0,0,0,5);
		
		add(jobLabel, gc);
		
		gc.gridx = 1;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(jobCombo, gc);
		
		/////////////////////////// 7. linje
		
		/////////////////////////// 8. linje
		
		gc.gridy++;
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
		/////////////////////////// 9. linje
		
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

class JobCategory {
	private String text;
	private int id;
	
	public JobCategory(int id, String text) {
		this.id = id;
		this.text = text;	
	}
	
	public String toString() {
		return text;
	}
	
	public int getID() {
		return id;
	}
}



