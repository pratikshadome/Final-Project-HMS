package multithreading;


class A1  extends Thread
{
	
	public void run1()
	{
		System.out.println("thread A is started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread A is running "+i);
		}
		System.out.println("exit thread A");
	}
}
class B1  extends Thread
{
	
	public void run1()
	{
		System.out.println("thread B is started");
		for(int j=0;j<=10;j++)
		{
			System.out.println("thread B is running "+j);
		}
		System.out.println("exit thread B");
	}
}
class C1  extends Thread
{
	
	public void run1()
	{
		System.out.println("thread C is started");
		for(int k=0;k<=10;k++)
		{
			System.out.println("thread C is running "+k);
		}
		System.out.println("exit thread C");
	}
}


public class UsingThread {

	public static void main(String[] args) 
	{
		A1 obj1 = new A1();
		B1 obj2 = new B1();
		C1 obj3 = new C1();
		
	    obj1.run1();
	    obj2.run1();
	    obj3.run1();
		
	}

}


