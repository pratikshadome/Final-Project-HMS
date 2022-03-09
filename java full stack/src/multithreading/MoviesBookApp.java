package multithreading;

class TotalEarnings extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			
		
		for(int i = 1;i<=10;i++)
		{
			total = total +100;
		}
		this.notify();
	}
}
}

public class MoviesBookApp
{

	public static void main(String[] args)
	{
		TotalEarnings t1 = new TotalEarnings();
		t1.start();
		
		
		synchronized(t1)
		{
			try
			{
				t1.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}System.out.println("total earnings " +t1.total+ " rs ");
			
		}
		
	}

}
