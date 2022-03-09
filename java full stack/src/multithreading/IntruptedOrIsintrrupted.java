package multithreading;

class Test1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());
		try
		{
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
	        Thread.sleep(1000);
	       //System.out.println(Thread.interrupted());				
		}		
			
		}		catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		
		
	}
}

public class IntruptedOrIsintrrupted

{

	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		t1.start();
		t1.interrupt();
		
	}

}
