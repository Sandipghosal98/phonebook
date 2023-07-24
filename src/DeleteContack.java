import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteContack {

	public static void delete() throws Exception{
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook?user=root&password=root");
		Statement st = con.createStatement();
		System.out.println("If you want to delete then select the sl no");
		String deletevalue = sc.nextLine();
		String delete = "DELETE FROM phonebook WHERE SLNO=+"+deletevalue;
		st.execute(delete);
		con.close();
		sc.close();
		System.out.println("YOUR CHOOSEN SL NO DELETED");
		System.out.println("THANK YOU");
	}

}
