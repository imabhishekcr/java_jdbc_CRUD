package jdbc_Demoapp1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//insert the data
public class Insert {

	public static void main(String[] args) {
		try {
			//connect to the database 
			Connection con  = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			////write SQl queries 
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('giri','chitradurga','giri@gmail.com','9026908101')");

			////close connection
			con.close();



		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}