package user_interface;

import javax.swing.JComboBox;

public class DropDown {
	
	String[] menu = {"Red", "Green", "Blue"};
	JComboBox myBox;
	
	public DropDown() {
		
		myBox = new JComboBox(menu);
	
	}
	
	public JComboBox getBox() {
		return myBox;
	}
	
	

}
