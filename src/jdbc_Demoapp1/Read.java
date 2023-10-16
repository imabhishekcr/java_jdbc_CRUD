package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//read the data

public class Read {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration");

			while(result.next()) {
				
				System.out.println(result.getString(1));//if result.next is true then it prints the column data of how much columns are there
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
