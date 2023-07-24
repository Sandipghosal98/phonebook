import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DisplayContact {
	public static void display() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook?user=root&password=root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM phonebook");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(".....Done the project......");
		}
	}
}
