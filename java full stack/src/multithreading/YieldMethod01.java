package multithreading;

class ABC extends Thread
{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
		//Thread.yield();
		System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}
public class YieldMethod01
{

	public static void main(String[] args) 
	{
		ABC o1 = new ABC();

		
		o1.start();
	    Thread.yield(); //if you want main method to stop and provide chance to other thread for excution 
		for(int i = 0; i<2;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+ " "+i);
		}
		
		
	}

}