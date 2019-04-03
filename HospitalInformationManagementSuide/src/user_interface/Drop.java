package user_interface;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Drop {
	
	JFrame frame;
	Dimension size;
	JLabel right_panel;
	
	public Drop (JFrame frame) {
		
		this.frame = frame;
		size = frame.getSize();
		
		right_panel = new JLabel();
		right_panel.setPreferredSize(new Dimension(size.width/5, size.height));
		
        right_panel.setBounds(0,100, size.width/5, size.height);
        right_panel.setBackground(new Color(255,0,0));
        right_panel.setForeground(new Color(255,0,0));
        right_panel.setOpaque(true);
        
        frame.getContentPane().add(right_panel);
        
        frame.setVisible(true);
		
	}
	
	

}
