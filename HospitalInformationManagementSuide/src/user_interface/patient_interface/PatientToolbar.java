package user_interface.patient_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PatientToolbar extends JPanel implements ActionListener{
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private PatientStringListener textListener;
	
	
	public PatientToolbar() {
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
	
	public void setStringListener(PatientStringListener listener) {
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
