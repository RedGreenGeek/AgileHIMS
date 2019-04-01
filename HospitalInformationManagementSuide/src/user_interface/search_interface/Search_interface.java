package user_interface.search_interface;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Search_interface {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				JFrame frame = new JFrame("Hospital");

				new SearchFrame();

			}

		});

	}

}
