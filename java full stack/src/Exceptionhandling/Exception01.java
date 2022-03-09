package Exceptionhandling;

class Pratiksha extends Exception
{
	Pratiksha(String msg)
	{
		super(msg);
	}
}


public class Exception01 
{
	public void show(int age,int weight) throws Pratiksha
	{
		
		if(age<25 && weight<50)
		{
			Pratiksha obj1 = new Pratiksha("not eligible for blood donation");
			throw obj1;
		}
		else
		{
			System.out.println(" eligible for blood donation");
		}
	}

	

	public static void main(String[] args)
	{
		
		Exception01 obj2 = new Exception01();
		try
		{
			obj2.show(70,50);
		}
		catch(Exception e)
		{
			System.out.println("exception occured"+e);
		}
		
	}	
}

	


