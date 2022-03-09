package Exceptionhandling;

public class ExceptionDemo
{
	public void show() 
	{
		try
		{
			System.out.println("hellllllllllllllllo");

			int a = 10;
			int b = a / 0;

			System.out.println("mumbai is dream city");
		}

		catch(Exception e)
		{
			System.out.println("Exception occured" + e);
		}

	}

	public void display() {

		System.out.println("pune is better than mumbai");

	}

	public static void main(String[] args) {
		ExceptionDemo Ex = new ExceptionDemo();
		Ex.show();
		Ex.display();

	}

}
