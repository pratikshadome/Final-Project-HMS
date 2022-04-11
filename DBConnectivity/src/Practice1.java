import java.sql.*;
public class Practice1 {

	public static void main(String[] args) throws SQLException 
	{
             try 
             {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql:///raw_data","root","12345");
				Statement stmt = con.createStatement();
				
				//String s1 = ("create table employee01(id int,name varchar(10),address varchar(10),salary int)");
			    //stmt.executeUpdate(s1);
			    String s2 = ("insert into employee01(id,name,address,salary)values(105,'ram','up',90000)");
			    stmt.execute(s2);
			
			 }
             catch (ClassNotFoundException e)
             {
            	 System.out.println("exception occured"+e);
				e.printStackTrace();
			 }
             
	}

}
