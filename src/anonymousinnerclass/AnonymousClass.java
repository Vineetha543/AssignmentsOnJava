package anonymousinnerclass;

public class AnonymousClass {
	public static void main(String[] args) {
		Connection c = DriverManager.getConnection();
		c.createStatement();
	}
}
