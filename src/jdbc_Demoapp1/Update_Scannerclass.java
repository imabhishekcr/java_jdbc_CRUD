package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//update the data 
public class Update_Scannerclass {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your email : ");
			String email = scan.next();
			
			System.out.println("enter your mobile : ");
			String mobile = scan.next();
			
			
			
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("UPDATE registration SET mobile= '"+mobile+"' WHERE email= '"+email+"'");
	con.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
