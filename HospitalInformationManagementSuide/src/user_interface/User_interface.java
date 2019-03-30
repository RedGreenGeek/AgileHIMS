package user_interface;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class User_interface {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				JFrame frame = new JFrame("Hospital");

				new MainFrame(frame);

			}

		});

	}

}
