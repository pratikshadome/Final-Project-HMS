package multithreading;

class Test extends Thread
{
       public void run()
       {
    	   for(int i = 0;i<=5;i++)
    	   {
    		   try 
    		   {
    		   System.out.println(" thread t1 is running "+i);
        	   Thread.sleep(1000);
			   } 
    		   catch (InterruptedException i1)
    		   {
					
					System.out.println("thread is terminated");	
			   }
    	   }
       }

	
	}

public class IntruptMethod {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.start();
	    t1.interrupted();

	}

}
