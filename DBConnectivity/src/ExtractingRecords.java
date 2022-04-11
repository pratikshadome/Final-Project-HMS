import java.sql.*;


public class ExtractingRecords {

	public static void main(String[] args) 
	{
          try 
          {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///raw_data","root","12345");
			Statement stmt = con.createStatement();	
			
			String query =("select id,name, address from student");
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println("id=="+rs.getInt("id")+"----name=="+rs.getString("name")+"---address=="+rs.getString("address"));
			}
			
			} 
          catch (ClassNotFoundException | SQLException e) 
          {
        	System.out.println("exception occured"+e);  
			e.printStackTrace();
		}
          
	}

}
