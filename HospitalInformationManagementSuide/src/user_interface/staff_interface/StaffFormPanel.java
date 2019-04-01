package user_interface.staff_interface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class StaffFormPanel extends JPanel {
	
	private JLabel firstNameLabel;
	private JLabel surnameLabel;
	private JLabel adressLabel;
	private JLabel tribeLabel;
	private JLabel birthdayLabel;
	private JLabel ageLabel;
	private JLabel departLabel;
	private JTextField firstNameField;
	private JTextField surnameField;
	private JTextField adressField;
	private JTextField tribeField;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private JTextField departField;
	private StaffTextPrompt dayGhost;
	private StaffTextPrompt monthGhost;
	private StaffTextPrompt yearGhost;
	private JButton okBtn;
	private StaffFormListener formListener;
	private JComboBox jobCombo;
	
	
	
	
	public StaffFormPanel() {
		Dimension dim = getPreferredSize();
		
		dim.width = 250;
		setPreferredSize(dim);
		
		firstNameLabel = new JLabel("First name: ");
		surnameLabel = new JLabel("Surname: ");
		adressLabel = new JLabel("Adress: ");
		tribeLabel = new JLabel("Tribe: ");
		birthdayLabel = new JLabel("Birthday: ");
		ageLabel = new JLabel("Job type: ");
		departLabel = new JLabel("Department: ");
		firstNameField = new JTextField(11);
		surnameField = new JTextField(11);
		adressField = new JTextField(11);
		tribeField = new JTextField(11);
		dayField = new JTextField(3);
		monthField = new JTextField(3);
		yearField = new JTextField(4);
		departField = new JTextField(11);
		dayGhost = new StaffTextPrompt("dd", dayField);
		monthGhost = new StaffTextPrompt("mm", monthField);
		yearGhost = new StaffTextPrompt("yyyy", yearField);
		jobCombo = new JComboBox();
		
		
		// Set-up for JList
		DefaultComboBoxModel jobModel = new DefaultComboBoxModel();
		jobModel.addElement(new JobCategory(0, "Nurse"));
		jobModel.addElement(new JobCategory(1, "Doctor"));
		jobModel.addElement(new JobCategory(2, "Clerk"));
		jobModel.addElement(new JobCategory(3, "ITC Officer"));
		jobCombo.setModel(jobModel);
		
		jobCombo.setPreferredSize(new Dimension(100, 25));
		jobCombo.setBorder(BorderFactory.createEtchedBorder());
		
		
		okBtn = new JButton("OK");
		
		okBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				String firstName = firstNameField.getText();
				String surname = surnameField.getText();
				String adress = adressField.getText();
				String tribe = tribeField.getText();
				String day = dayField.getText();
				String month = monthField.getText();
				String year = yearField.getText();
				String depart = departField.getText();

				JobCategory jobCat = (JobCategory) jobCombo.getSelectedItem();

				
				
				StaffFormEvent ev = new StaffFormEvent(this, firstName, surname, adress, tribe, day, month, year, jobCat.getID(), depart);
				
				if (formListener != null) {
					formListener.formEventOccurred(ev);
				}
;			}
			
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("Add staff member");
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
		
		add(tribeLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(tribeField, gc);
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
		
		add(ageLabel, gc);
		
		gc.gridx = 1;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(jobCombo, gc);
		
		/////////////////////////// 7. linje
		
		gc.gridx = 0;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5); // (top, left, bottom, right)
		
		add(departLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(departField, gc);
		
		
		/////////////////////////// 8. linje
		
		gc.gridx = 1;
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		
		add(okBtn, gc);
	}

	public void setFormListener(StaffFormListener listener) {
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



