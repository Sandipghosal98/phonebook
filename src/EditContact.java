import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class EditContact {
	public static void edit() throws Exception{
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook?user=root&password=root");
		Statement st = con.createStatement();
		System.out.println("Enter the sl no which you have to changed");
		String slno = sc.nextLine();
		System.out.println("Enter the column name which you have to changed");
		String column = sc.nextLine();
		System.out.println("Enter the value which you want to delete");
		String value = sc.nextLine();
		String update = "UPDATE phonebook SET"+column+"="+value+"WHERE"+" SLNO="+slno;
		st.execute(update);
		con.close();
		sc.close();
		System.out.println("TABLE UPDATE SUCCESSFULLY DONE");
		System.out.println("THANK YOU");
	}
}
