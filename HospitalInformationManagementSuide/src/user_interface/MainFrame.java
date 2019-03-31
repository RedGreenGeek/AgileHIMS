package user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	
	
	
	public MainFrame() {
		super("Hello World");
		
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
				String name = event.getName();
				String job = event.getJob();
				int ageCat = event.getAgeCategory();
				
				textPanel.appendText(name + ": " + job + ageCat + "\n" );
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
