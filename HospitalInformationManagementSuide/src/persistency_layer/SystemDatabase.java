package persistency_layer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// USEFUL
// Command for terminal: mysql -u root -p   -> start interactive
// Command + 7 to comment out block

public class SystemDatabase {

	private String port;
	private String URL;
	private String database;
	private String username;
	private String password;
	private String[] tables;
	private String table;

	private Connection myConnection;

	public SystemDatabase(String remote) {

		this.port = "3306/";
		this.URL = "jdbc:mysql://sql7.freemysqlhosting.net:";
		this.database = "sql7286392";
		this.username = "sql7286392";
		this.password = "gH8nA4tzcx";
		this.tables = new String[] { "Hospital", "Staff", "Patients" };

		EstablishConnection();

	}

	public SystemDatabase() {

		this.port = "3306/";
		this.URL = "jdbc:mysql://localhost:";
		this.database = "Hospital";
		this.username = "root";
		this.password = "AGILE2019";
		this.table = "users";

		EstablishConnection();

	}

	private boolean isConnected() {

		return myConnection != null;

	}

	private void insertPatient(int p_id, String f_name, String l_name, int Department_id, int bed_id) {

		String query = String.format("insert into Patient (Patient_id, First_name, Last_name, Department_id, Bed_id) "
				+ "values (%d, \"%s\", \"%s\", %d, %d)", p_id, f_name, l_name, Department_id, bed_id);

		try {
			Statement myStatement = myConnection.createStatement();
			myStatement.executeUpdate(String.format(query));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void insertStaff(int Staff_id, String f_name, String l_name, int Department_id) {

		String query = String.format("insert into Staff (Staff_id, First_name, Last_name, Department_id) "
				+ "values (%d, \"%s\", \"%s\", %d)", Staff_id, f_name, l_name, Department_id);

		try {
			Statement myStatement = myConnection.createStatement();
			myStatement.executeUpdate(String.format(query));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void insertDepartment(int Department_id, String Department_name, int MaxBeds, int BedsInUse, int Queue_id) {

		String query = String.format(
				"insert into Hospital (Department_id, Department_name, MaxBeds, BedsInUse, Queue_id) "
						+ "values (%d, \"%s\", %d, %d, %d)",
				Department_id, Department_name, MaxBeds, BedsInUse, Queue_id);

		try {
			Statement myStatement = myConnection.createStatement();
			myStatement.executeUpdate(String.format(query));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void printPatients() {

		String query = "select * from Patient;";

		if (this.isConnected()) {

			try {

				// 2. Create a statement
				Statement myStatement = myConnection.createStatement();

				// 3. Execute SQL query
				ResultSet myResult = myStatement.executeQuery(String.format(query));

				while (myResult.next()) {

					System.out.println("Patient_id: " + myResult.getString("Patient_id") + "\n" + "First_name: "
							+ myResult.getString("First_name") + "\n" + "Last_name: "
							+ myResult.getString("Last_name"));

				}

				myStatement.close();

			} catch (Exception e) {
				System.out.println("The table does not exist!");
			}

		}

		else {

			System.out.println("Remember to connect first!");

		}

	}

	private void printStaff() {

		String query = "select * from Staff;";

		if (this.isConnected()) {

			try {

				// 2. Create a statement
				Statement myStatement = myConnection.createStatement();

				// 3. Execute SQL query
				ResultSet myResult = myStatement.executeQuery(String.format(query));

				while (myResult.next()) {

					System.out.println("Staff_id: " + myResult.getString("Staff_id") + "\n" + "First_name: "
							+ myResult.getString("First_name") + "\n" + "Last_name: " + myResult.getString("Last_name")
							+ "\n" + "Department_id: " + myResult.getString("Department_id"));

				}

				myStatement.close();

			} catch (Exception e) {
				System.out.println("The table does not exist!");
			}

		}

		else {

			System.out.println("Remember to connect first!");

		}

	}

	private void deleteData() {

		String query1 = "DELETE from Hospital;";
		String query2 = "DELETE from Patient;";
		String query3 = "DELETE from Staff;";

		if (this.isConnected()) {

			try {

				// 2. Create a statement
				Statement myStatement = myConnection.createStatement();

				// 3. Execute SQL query
				myStatement.executeUpdate(String.format(query1));
				myStatement.executeUpdate(String.format(query2));
				myStatement.executeUpdate(String.format(query3));

				myStatement.close();

			} catch (Exception e) {
				System.out.println("The table does not exist!");
			}

		}

		else {

			System.out.println("Remember to connect first!");

		}

	}

	private void printDepartment() {

		String query = "select * from Hospital;";

		if (this.isConnected()) {

			try {

				// 2. Create a statement
				Statement myStatement = myConnection.createStatement();

				// 3. Execute SQL query
				ResultSet myResult = myStatement.executeQuery(String.format(query));

				while (myResult.next()) {

					System.out.println("Department_id: " + myResult.getString("Department_id") + "\n"
							+ "Department_name: " + myResult.getString("Department_name") + "\n" + "MaxBeds: "
							+ myResult.getString("MaxBeds") + "\n" + "BedsInUse: " + myResult.getString("BedsInUse")
							+ "\n" + "Queue_id: " + myResult.getString("Queue_id"));

				}

				myStatement.close();

			} catch (Exception e) {
				System.out.println("The table does not exist!");
			}

		}

		else {

			System.out.println("Remember to connect first!");

		}

	}

	private void CloseConnection() {

		try {
			myConnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void EstablishConnection() {

		try {

			// 1. Get connection to MySQL database
//			myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Usr_Credentials", "root",
//					"AGILE2019");

			myConnection = DriverManager.getConnection((URL + port + database), username, password);

			// 2. Create a statement
			Statement myStatement = myConnection.createStatement();
			myStatement.executeUpdate("USE " + database + ";");

			myStatement.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		SystemDatabase db = new SystemDatabase("dfgdfg");

		db.deleteData();

		db.insertPatient(17, "Andreas", "Hej", 1, 11);
		db.insertPatient(13, "Andreas", "Hej", 1, 11);
		db.insertStaff(1, "Staff1", "FFATS", 11);
		db.insertStaff(2, "Staff2", "FFATS", 11);
		db.insertStaff(3, "Staff3", "FFATS", 11);
		db.insertDepartment(1, "Staff1", 30, 11, 1);
		db.insertDepartment(1, "Staff2", 56, 11, 1);
		db.insertDepartment(1, "Staff3", 100000, 11, 1);

		db.printPatients();
		db.printDepartment();
		db.printStaff();

//
	}

}
