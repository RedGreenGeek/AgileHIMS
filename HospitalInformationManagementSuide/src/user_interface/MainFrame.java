package user_interface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame {
	
	private static JButton loginbutton;
	private static JTextField usernameField;
	private static JPasswordField passwordField;
	
	static HashMap<String, String> c;
	
	static JFrame frame;
	
	
	
	

	public MainFrame(JFrame frame) {
		
		this.frame = frame;
		
	// Create password
		
		c = new HashMap<>();
		
		c.put("123", "root");
		c.put("223", "root");
		c.put("323", "root");
		c.put("423", "root");
		c.put("523", "root");
			
		// Creating JFrame 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		
		System.out.println(frame.getSize());

		
		
		addComponent(frame);
		
	    Insets insets = frame.getInsets();
	    
	    System.out.println(insets);
	    
	    frame.setSize(800 + insets.left + insets.right,
	                  600 + insets.top + insets.bottom);
	    frame.setVisible(true);
    
	}
		
	
	public static void addComponent(Container pane) {
		
		pane.setLayout(null);
		
		loginbutton = new JButton("login");
		
        JLabel Password = new JLabel("Password");
        JLabel Username = new JLabel("Username");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        
        pane.add(loginbutton);
        pane.add(Password);
        pane.add(Username);
        pane.add(usernameField);
        pane.add(passwordField);
        
        Insets insets = pane.getInsets();
        
        loginbutton.setPreferredSize(new Dimension(80,20));
        Dimension size = loginbutton.getPreferredSize();
        System.out.println(size);
        
        loginbutton.setBounds(300 + insets.left, 255 + insets.top,
                size.width, size.height);
        
        Password.setPreferredSize(new Dimension(160, 20));;
        size = Password.getPreferredSize();
        System.out.println(size);
        
        Password.setBounds(300 + insets.left, 135 + insets.top,
                size.width, size.height);
        
        Username.setPreferredSize(new Dimension(160, 20));;
        size = Username.getPreferredSize();
        System.out.println(size);
        
        Username.setBounds(300 + insets.left, 55 + insets.top,
                size.width, size.height);
        
        usernameField.setPreferredSize(new Dimension(160, 20));;
        size = usernameField.getPreferredSize();
        System.out.println(size);
        
        usernameField.setBounds(300 + insets.left, 85 + insets.top,
                size.width, size.height);
        
        passwordField.setPreferredSize(new Dimension(160, 20));;
        size = passwordField.getPreferredSize();
        System.out.println(size);
        
        passwordField.setBounds(300 + insets.left, 165 + insets.top,
                size.width, size.height);
        
        loginbutton.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(e);
				
				login(e);
				
			}
        	
        });
        
	}
	
	public static void login(ActionEvent e) {
		
		String usernameprint = usernameField.getText();
		String passwordprint = String.valueOf(passwordField.getPassword());

        System.out.println("Username is: " + usernameprint);
        System.out.println("Password is: " + passwordprint);
        
        System.out.println(frame.getSize());
        
        if (passwordprint.compareTo(c.get(usernameprint)) == 0) {
        	
        	System.out.println("Welcome!");
        	
        	frame.getContentPane().removeAll();
        	frame.repaint();
        	frame.revalidate(); 
        	
        	System.out.println(usernameprint.charAt(0));
        	System.out.println(usernameprint.charAt(0) == '1');
        	
        	
        	if (usernameprint.charAt(0) == '1') {
        		
        		new NurseLogin(frame);
        		
        	}
        	
        	else if (usernameprint.charAt(0) == '2') {
        		
        		new ClerkLogin(frame);
        		
        	}
        	
        	else if (usernameprint.charAt(0) == '3') {
        		
        		new DoctorLogin(frame);
        		
        	}
        	
        	else {
        		
        		System.out.println("Unidentified clearence!");
        		
        	}
        	

        	
        }
        
        else  {
        	
        	System.out.println("Wrong!");

        }

		
		
		
		
	}
	
}
