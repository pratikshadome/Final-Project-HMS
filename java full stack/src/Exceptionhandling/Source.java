package Exceptionhandling;

class Source extends Exception
{
     Source(String msg)
     {
    	 super(msg);
     }
}
  class MyException
 {
	public String chechName(String firstName, String lastName)throws Source
	{
	
	if(firstName.equals(" ") && lastName.equals(" "))
	{
		Source obj1 = new Source("first name and last name blank");
		throw obj1;
		
	
	}
	else 
	{
	    return (firstName+" "+lastName);
	}
	}
 
     
     
	public static void main(String[] args) 
	{
		MyException obj = new MyException();
		try
		{
			
			System.out.println(obj.chechName("Alian", "Hasley"));
		}
		catch(Exception e)
		{
			System.out.println("exception occured"+e);
		}
		
		

	}

}
