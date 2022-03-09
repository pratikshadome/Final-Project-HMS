package inhritance;

class Add
{
	double sum;
	public void addition(int a, double b)
	{
		sum = a+b;
		System.out.println("\n..............................................................");
		System.out.println("print value of a is ="+a);
		System.out.println("print value of b is ="+b);
		System.out.println("addition of a and b is ="+sum);
		
	}
} 
	class Sub extends Add
	{
		int sub;
		public void substraction(int a, int b)
		{
			sub = a-b;
			System.out.println("\n..............................................................");
			System.out.println("print value of a is ="+a);
			System.out.println("print value of b is ="+b);
			System.out.println("substraction of a and b is ="+sub);
			
		}
}
		class show extends Sub
		{
			public void show()
			{
				System.out.println("\n..............................................................");
				System.out.println("helllllllllllllllllllllllo");
			}
				
			}	

public class Multilevelo2 {

	public static void main(String[] args)
	{
		show obj = new show();
		
		obj.addition(10,20);
		obj.substraction(30,20);
		obj.show();
	}

}
		
