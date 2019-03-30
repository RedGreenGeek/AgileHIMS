package user_interface;
import javax.swing.SwingUtilities;

public class User_interface {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new Login();

			}

		});

	}

}
