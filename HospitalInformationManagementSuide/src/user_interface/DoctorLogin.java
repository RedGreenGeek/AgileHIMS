package user_interface;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class DoctorLogin {
	
	
	// Containers need
	
	JFrame pane;
	
	public DoctorLogin(JFrame pane) {
		
		this.pane = pane;
		
		addText();
		addMenu();
		
		pane.setVisible(true);

	}
	
	private void addText() {
		
		// Text field
		
		JLabel text = new JLabel("WELCOME DOCTOR!");
		text.setFont(new Font("lato", 1, 32));
		
        Dimension size = text.getPreferredSize();
        
        text.setBounds(400 - size.width/2, 300 - size.height/2,
                size.width, size.height);
        
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setVerticalAlignment(SwingConstants.CENTER);
		
		pane.add(text);
		
	}
	
	private void addMenu() {
		
		JMenuBar menu = new JMenuBar();
		
		pane.setJMenuBar(menu);
		
//		menu.setPreferredSize(new Dimension(800,50));
//		Dimension size = menu.getPreferredSize();
//		
//        menu.setBounds(0, 0,
//                size.width, size.height);
//		
        

		JMenu item1 = new JMenu("User");
		menu.add(item1);
		JMenuItem logout = new JMenuItem("Log out");
		item1.add(logout);
		
		JMenu item2 = new JMenu("Help");
		menu.add(item2);
		JMenuItem help = new JMenuItem("No help");
		item2.add(help);
		
		JMenu item3 = new JMenu("Settings");
		menu.add(item3);
		JMenuItem setting = new JMenuItem("Colors");
		item2.add(setting);
		
		// Adding actions
		
		logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				pane.setJMenuBar(null);
	        	pane.getContentPane().removeAll();
	        	pane.repaint();
	        	pane.revalidate();
	        	
	        	new MainFrame(pane);

				
			}
			
		});
		
		
	}

}
