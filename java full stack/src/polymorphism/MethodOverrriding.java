package polymorphism;

class Family
{
	String str1 ;
	Family(String s)
	{
		System.out.println("this is  Family  constructor  "+s );
		
	}
	public void father()
	{
		System.out.println("father is a head of family  "+str1);
		
	}
}
class Family2 extends Family
{
	Family2()
	{
	   super("Pratiksha");
	   super.str1 = "Dome";
	   System.out.println("this is  Family2 constructor");	
	}
	public void father()
	{
		super.father();
		System.out.println("father is also imp part of family");
	}
}

public class MethodOverrriding {

	public static void main(String[] args) 
	{
		Family2 obj1 = new Family2();
		obj1.father();
	}

}
