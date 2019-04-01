package user_interface.patient_interface;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Patient_interface {
	


	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				new PatientFrame();

			}

		});

	}

}
