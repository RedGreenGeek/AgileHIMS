package user_interface.staff_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StaffToolbar extends JPanel implements ActionListener{
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StaffStringListener textListener;
	
	
	public StaffToolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		
		// Dett her er flowlayout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	public void setStringListener(StaffStringListener listener) {
		this.textListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton clicked = (JButton) event.getSource();
		
		if (clicked == helloButton) {
			if(textListener != null) {
				// Det der sker her er at den kalder metoden textEmitted i MainFrame der så sender teksten videre til textPanel.
				textListener.textEmitted("Hello\n");
			}

		}
		else {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}

		}
	}
}
