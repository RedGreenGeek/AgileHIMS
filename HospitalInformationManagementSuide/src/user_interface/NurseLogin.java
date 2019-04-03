package user_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class NurseLogin {
	
	// Containers need
	
	JFrame pane;
	JLabel right_panel;
	Dimension size_menu;
	JButton[] beds = new JButton[200];
	JScrollPane scrollPane;
	
	
	
	
	// Toggles 
	
	boolean show = true;
	boolean show_bed = true;
	
	public NurseLogin(JFrame pane) {
		
		this.pane = pane;
		
		addMenu();
		
		pane.setVisible(true);

	}
	
	private void addBedManagement() {
		
		int n = 200;
		JLabel j = new JLabel();
		j.setLayout(new FlowLayout());
		j.setPreferredSize(new Dimension(400,n*9));
		j.setBorder(LineBorder.createBlackLineBorder());
		
		for (int i = 0; i < n; i++) {
			
			String s = String.format("%d",i);
			beds[i] = new JButton(s);
			beds[i].setBackground(Color.GREEN);
			beds[i].setBorderPainted(false);
			beds[i].setOpaque(true);
			beds[i].setPreferredSize(new Dimension(82,29));
			
			int k = i;
			
			beds[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if (beds[k].getBackground().equals(Color.GREEN)) {
						beds[k].setBackground(Color.RED);
					}
					
					else {
						beds[k].setBackground(Color.GREEN);
					}
					
				}
				
			});
			System.out.println(beds[i].getPreferredSize());
			j.add(beds[i]);
			
			
		}
		
		System.out.println(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
	    scrollPane = new JScrollPane(j,   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPane.setHorizontalScrollBar(null);
	    scrollPane.setPreferredSize(new Dimension(400, 400));
	    // Add panel to frame

		Dimension sizej = scrollPane.getPreferredSize();
		
        scrollPane.setBounds(400 - sizej.width/2, 300 - sizej.height/2,
                sizej.width, sizej.height);
		

        pane.add(scrollPane);
        scrollPane.setVisible(false);
		
	}
	
	private void addBar() {
		
		if (show) {
		
			Dimension size = pane.getSize();
			
			right_panel = new JLabel("");
			right_panel.setPreferredSize(new Dimension(size.width/5, size.height));
			right_panel.setLayout(new FlowLayout());
			
	        right_panel.setBounds(0,size_menu.height, size.width/5, size.height);
	        right_panel.setBackground(new Color(55,0,0));
	        right_panel.setOpaque(true);

	        JButton five = new JButton("Bed Management");
	        five.setForeground(Color.WHITE);
	        five.setBorderPainted(false);
	        addBedManagement();
	        
	        five.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if (show_bed) {
					
						scrollPane.setVisible(true);
				    	pane.repaint();
				    	pane.revalidate();
				    	show_bed = false;
					
					}
					
					else {
						
						scrollPane.setVisible(false);
						pane.repaint();
				    	pane.revalidate();
						show_bed = true;
					}
					
				}
	        	
	        	
	        	
	        });
	        
	        right_panel.add(five);
	        
	        pane.add(right_panel);
	    	pane.repaint();
	    	pane.revalidate();
	    	
	    	show = show == true ? false : true;
	    	
	    	System.out.println("Here");
    	
		}
		
		else {
			
			pane.remove(right_panel);
	    	pane.repaint();
	    	pane.revalidate();
	    	
	    	show = show == true ? false : true;
			
		}
		
	}
	
	private void addText() {
		
		// Text field
		
		JLabel text = new JLabel("WELCOME NURSE!");
		text.setFont(new Font("lato", 1, 32));
		
        //text.setPreferredSize(new Dimension(200,100));
        Dimension size = text.getPreferredSize();
        
        text.setBounds(400 - size.width/2, 300 - size.height/2,
                size.width, size.height);
        
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setVerticalAlignment(SwingConstants.CENTER);
		
		pane.add(text);
		
	}
	
	private void addMenu() {
		
		JMenuBar menu = new JMenuBar();
		size_menu = menu.getPreferredSize();
		
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
		item3.add(setting);
		
		setting.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
	        	
	        	addBar();
	        	
	        	System.out.println("Hello");

				
			}
			
		});
		
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
