package oops;

class Add
{
	double sum;
	public void addition(int a, double b)
	{
		sum = a+b;
		System.out.println("print value of a is ="+a);
		System.out.println("print value of b is ="+b);
		System.out.println("addition of a and b is ="+sum);
		
	}
}
	class Sub
	{
		int sub;
		public void substraction(int a, int b)
		{
			sub = a-b;
			System.out.println("print value of a is ="+a);
			System.out.println("print value of b is ="+b);
			System.out.println("substraction of a and b is ="+sub);
			
		}
}
		class Mul
		{
			static double mul;
			public static void multiplication(int a, double b)
			{
				mul = a*b;
				System.out.println("print value of a is ="+a);
				System.out.println("print value of b is ="+b);
				System.out.println("multiplication a and b is ="+mul);
				
			}	
}
public class Parameterpassing
{

	public static void main(String[] args)
	{
		Add obj1 = new Add();
		obj1.addition(10,20.33);
		Sub obj2 = new Sub();
		obj2.substraction(100,50);
		Mul.multiplication(33,4.66);
	}
}
		