package multithreading;



class xxx extends Thread
{
     public void run()
     {
    	 System.out.println(" thread xxx");
    	 
     }
}
class yyy extends Thread
{
     public void run()
     {
    	 System.out.println(" thread yyy");
     }
}
class zzz extends Thread
{
     public void run()
     {
    	 System.out.println(" thread zzz");
     }
}



public class Priorities
{

	public static void main(String[] args)
	{
		xxx obj1 = new xxx();
		yyy obj2 = new yyy();
		zzz obj3 = new zzz();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(1);
		t2.setPriority(t2.MAX_PRIORITY);
		t3.setPriority(t3.NORM_PRIORITY);
		
		

	}

}
