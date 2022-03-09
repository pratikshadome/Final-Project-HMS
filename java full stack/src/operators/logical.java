package operators;

public class logical
{

	public static void main(String[] args)
	{
		int a = 50;
		int b = 80;
		int c = 20;
		
		if((a>b) && (a>c))
		{
			System.out.println("A is agreatest");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("B is greatest");
		}
		else
		{
			System.out.println("C is greater");
		}
	}					

}


