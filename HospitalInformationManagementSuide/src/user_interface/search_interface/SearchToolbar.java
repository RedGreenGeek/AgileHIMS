package user_interface.search_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import user_interface.staff_interface.StaffFrame;

public class SearchToolbar extends JPanel implements ActionListener{
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private SearchStringListener textListener;
	
	
	public SearchToolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		helloButton = new JButton("Staff add");
		goodbyeButton = new JButton("Goodbye");
		
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		
		// Dett her er flowlayout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	public void setStringListener(SearchStringListener listener) {
		this.textListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton clicked = (JButton) event.getSource();
		
		if (clicked == helloButton) {
			if(textListener != null) {
				// Det der sker her er at den kalder metoden textEmitted i MainFrame der så sender teksten videre til textPanel.
				textListener.textEmitted("Hello\n");
				new StaffFrame();
			}

		}
		else {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}

		}
	}
}
