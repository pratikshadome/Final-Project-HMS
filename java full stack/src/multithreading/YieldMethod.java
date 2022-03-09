package multithreading;

		public class YieldMethod extends Thread  
		{  
		    public void run()  
		    {  
		        for (int i=0; i<3 ; i++)  
		            System.out.println(Thread.currentThread().getName() );  
		    }  
		    public static void main(String[]args)  
		    {  
		      YieldMethod t1 = new YieldMethod();  
		      YieldMethod t2 = new YieldMethod();  
		      
		      
		      
		        t1.start();  
		        t2.start();  
		       
		        for (int i=0; i<3; i++)  
		        {  
		            
		            t1.yield();  // current thread main it passess the control to another child thread using yield 
		            System.out.println(Thread.currentThread().getName());  
		        }  
		    }  
	

	}


