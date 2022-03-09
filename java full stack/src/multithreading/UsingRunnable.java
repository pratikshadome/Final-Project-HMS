package multithreading;

class A implements Runnable
{
	
	public void run()
	{
		System.out.println("thread A is started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread A is running"+i);
		}
		System.out.println("exit thread A");
	}
}
class B implements Runnable
{
	
	public void run()
	{
		System.out.println("thread B is started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread B is running"+i);
		}
		System.out.println("exit thread B");
	}
}
class C  implements Runnable
{
	
	public void run()
	{
		System.out.println("thread C is started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread C is running"+i);
		}
		System.out.println("exit thread C");
	}
}


public class UsingRunnable {

	public static void main(String[] args) 
	{
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
