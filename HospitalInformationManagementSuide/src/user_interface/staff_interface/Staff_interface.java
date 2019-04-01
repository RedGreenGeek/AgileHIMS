package user_interface.staff_interface;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Staff_interface {
	


	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				new StaffFrame();

			}

		});

	}

}
