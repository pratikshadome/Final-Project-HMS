
import java.sql.*;

public class DatabaseConnectivity 
{

	public static void main(String[] args)
	{
             try 
             {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql:///raw_data","root","12345");
				
				Statement stmt = con.createStatement();
				
				String query = "create table student(id int,name varchar(20),address varchar(30))";
				stmt.executeUpdate(query);
				
			 }
             catch (ClassNotFoundException | SQLException e)
             {
				
				System.out.println("exception has occured"+e);
            	 e.printStackTrace();
			 }
             
	}

}
