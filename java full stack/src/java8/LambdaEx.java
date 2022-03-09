package java8;

interface Demo1
{
	public abstract void operation(int x, int y);
	
	public default void show()
	{
		System.out.println("helllo java");
	}
	public static void display()
	{
		System.out.println("hiiiiiiiiiiiiii");
	}
	
	
}


public class LambdaEx
{

	public static void main(String[] args) 
	{
		Demo1 D = (x,y)->System.out.println(x+y);
		D.operation(10, 10);
		
		Demo1 D1 = (x,y)->System.out.println(x-y);
		D1.operation(20,10);
		
		D.show();
		Demo1.display();
	}

}
