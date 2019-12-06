package anonymousinnerclass;

public class DriverManager {
	static Connection getConnection() {
		Connection c = new Connection() {

			@Override
			public void createStatement() {

				System.out.println("Anonymous Inner classes method");

			}
		};
		return c;
	}
}
