package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//insert the data
public class Insert_Scannerclass {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your name : ");
			String name = scan.next();
			
			
			System.out.println("enter your city : ");
			String city = scan.next();
			
			System.out.println("enter your email : ");
			String email = scan.next();
			
			System.out.println("enter your mobile : ");
			String mobile  = scan.next();
			
			//connect to the database 
			Connection con  = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			////write SQl queries 
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");

			////close connection
			con.close();



		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
