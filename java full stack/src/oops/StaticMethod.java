package oops;


class Company
{
	int empid;
	String empname;
	static String Compname = "capgemini";
	
	static void modify()
	{
		Compname = "infosys";
		
	}
	
	Company(int i, String n)
	{
		empid = i;
		empname = n;
		
	}
	public void show()
	{
		System.out.println(empid+ "" +empname+ "" +Compname);
	}
}
public class StaticMethod {

	public static void main(String[] args)
	{
		Company.modify();
		
		
		Company c= new Company(10," Pratiksha ");
		Company c1= new Company(20," Prashant ");
		
		c.show();
		c1.show();
	}

}
