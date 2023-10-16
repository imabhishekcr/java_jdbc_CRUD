package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//update the data 
public class Update {

	public static void main(String[] args) {
		try {
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("UPDATE registration SET mobile= '8553550419' WHERE email= 'abhi@gmail.com'");
	con.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
