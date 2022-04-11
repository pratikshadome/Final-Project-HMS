
import java.sql.*;
public class InsertRecord 
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:/// raw_data","root","12345");
			Statement stmt = con.createStatement();
			
			String query1 = "insert into student values(2,'sham','ahemadnagar')";
			
			int i = stmt.executeUpdate(query1);
			if(i>0)
			{
				System.out.println("record inserted");
			}
			else
			{
				System.out.println("error");
			}
					
		} catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("exception is occured"+e);
			e.printStackTrace();
		}
	

	}

}
