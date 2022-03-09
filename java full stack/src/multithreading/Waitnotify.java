package multithreading;

class XYZ extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			
	    for(int i = 1;i<=10;i++)
	    {
	    	 total = total +100;
	    }
	    this.notifyAll();
		}
	}	
}

public class Waitnotify
{
	public static void main(String[] args) 
	{     
               XYZ obj1 = new XYZ();
               
               obj1.start();
               
                synchronized(obj1)
               {
            	   try
              {
					obj1.wait();
		      }
            	   catch (InterruptedException e)
            	   {
				    e.printStackTrace();
				   }System.out.println("total earning is "+obj1.total);
	               
               }
	}

}
