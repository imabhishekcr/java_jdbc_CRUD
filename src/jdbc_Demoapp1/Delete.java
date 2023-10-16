package jdbc_Demoapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//delete the record
public class Delete {

	public static void main(String[] args) {
		try {
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("DELETE FROM registration WHERE name  = 'giri'");
	con.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
