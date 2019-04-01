package user_interface.staff_interface;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StaffTextPanel extends JPanel {
	
	private JTextArea textArea;
	
	
	public StaffTextPanel() {
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		textArea.setEditable(false);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}
