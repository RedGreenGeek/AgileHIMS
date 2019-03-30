package user_interface;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hospital");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel left = new JPanel(new GridLayout(1, 1));
		JPanel right = new JPanel(new GridLayout(1, 1));

		JLabel left_image = new JLabel("");
		String adress_left = "/Users/andreasengly/Documents/DTU/4. semester/02160 Agile Object-Oriented Software Development/Hospital_GUI/Images/LEFT_background.png";
		left_image.setIcon(new ImageIcon(adress_left));

		JLabel right_image = new JLabel("");
		String adress_right = "/Users/andreasengly/Documents/DTU/4. semester/02160 Agile Object-Oriented Software Development/HospitalProject/Background_right.png";
		right_image.setIcon(new ImageIcon(adress_right));

		left.add(left_image);
		right.add(right_image);

		frame.add(left, BorderLayout.WEST);
		frame.add(right, BorderLayout.EAST);

		frame.pack();
		frame.setVisible(true);

	}

}
