import java.sql.*;


public class InsertRecord01 {

	public static void main(String[] args)
	{
              try 
              {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql:///raw_data","root","12345");
				Statement stmt = con.createStatement();
				
				String query = "insert into student(id,name)values(?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, 101);
				pstmt.setString(2, "Pratiksha");
				int i = pstmt.executeUpdate();
				if(i>0)
				{
					System.out.println("inserted");
				}
				
			  } 
              catch (ClassNotFoundException | SQLException e) 
              {
            	 System.out.println("exception occured"+e); 
				e.printStackTrace();
			}
              
	}

}
