import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class Createcontract {
	

	public static void create() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook?user=root&password=root");
		Statement st = con.createStatement();
		System.out.println("Enter sl no: ");
		String slno = sc.nextLine();
		System.out.println("Enter Name of contact.....");
		String Name = sc.nextLine();
		System.out.println("Enter contact No......");
		String contactNo = sc.nextLine();
		System.out.println("Enter State Number: ");
		String state = sc.nextLine();
		String query = "INSERT INTO phonebook VALUES"+"("+slno+","+Name+","+contactNo+","+state+")";
		st.execute(query);
		con.close();
		System.out.println("Successfully Updated");
		System.out.println("THANK YOU FOR YOUR UPDATE DATA");
	}

}
