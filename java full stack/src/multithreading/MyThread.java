package multithreading;

public class MyThread 
{

	public static void main(String[] args) 
	{
		Thread t = new Thread();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		t.currentThread();
		t1.currentThread();
		t2.currentThread();
		t3.currentThread();
		System.out.println("My Current Thread is : "+t);
		
		System.out.println("My current Thread is : "+t1);
		System.out.println("My current Thread is : "+t2);
		System.out.println("My current Thread is : "+t3);
		
		
		t.setName("My Thread");
        System.out.println("My current Thread is : "+t.getName());
        
        
        for(int i=0;i<5;i++)
        {
        	
			//t.sleep(2000);
			System.out.println("Thread running at " +i);
			
        }
	}

}
