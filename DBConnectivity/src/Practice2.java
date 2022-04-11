import java.sql.*;
public class Practice2 
{

	public static void main(String[] args) throws SQLException
	{
		 try 
         {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql:///raw_data","root","12345");
			Statement stmt = con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from employee01 where salary>=500000");
			while(rs.next())
			{
				System.out.println(rs.getString("employee01"));
				System.out.println(rs.getInt("salary"));
			}
			
			
         }
         catch (ClassNotFoundException e)
         {
        	 System.out.println("exception occured"+e);
			e.printStackTrace();
		 }
         
	}

}
