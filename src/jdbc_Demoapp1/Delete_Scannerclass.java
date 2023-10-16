package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//delete the record
public class Delete_Scannerclass {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your name : ");
			String name = scan.next();
			
			
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("DELETE FROM registration WHERE name  = '"+name+"'");
	con.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
