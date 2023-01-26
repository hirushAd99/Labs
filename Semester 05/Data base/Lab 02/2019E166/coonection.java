import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class MyDataBase {
	


	public static void main(String[] args) {
		System.out.println("Connecting to a selected database...");
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAB01_166","sqluser", "sqluserpw");) {		      
	         System.out.println("Connected database successfully...");  
	         Statement myStmt = conn.createStatement();
	         String sql = "INSERT INTO EMPLOYEE values ('Hirush', 'B', 'Vishwajith', '112323489', '1999-04-04', '17, Main Road, TY', 'M', 150000, '123456789', 1)";
	         myStmt.executeUpdate(sql);
	         System.out.println("Insert successfull.");
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
		// TODO Auto-generated method stub
	      
	      

	}

}
