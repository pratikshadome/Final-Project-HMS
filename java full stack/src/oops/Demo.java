package oops;

public class Demo
{
	
	public void square(int b )
	{
		System.out.println("area of square "+(b * b));
	}
	
	public void triangle(int b, int h)
	{
		System.out.println("area of triangle "+(0.5*b*h));
	}
	
	public static void show()
	{
		System.out.println("Hello pratiksha");
	}
	public int add(int A,int B)
	{
		return  A+B;
	}
	
	 public static void main(String[] args)
	{
	
		Demo d = new Demo();
		Demo.show();		
		d.square(10);
		d.triangle(10,20);
		System.out.println(d.add(10,20));

		// TODO Auto-generated method stub

	}

}
