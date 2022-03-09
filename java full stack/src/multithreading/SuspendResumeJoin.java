package multithreading;


class A01  extends Thread
		{
			
			public void run()
			{
				System.out.println("thread A is started");
				for(int i=0;i<=10;i++)
				{
					System.out.println("thread A is running "+i);
				}
				System.out.println("exit thread A");
			}
		}
class B01  extends Thread
		{
			
			public void run()
			{
				System.out.println("thread B is started");
				for(int j=0;j<=10;j++)
				{
					System.out.println("thread B is running "+j);
				}
				System.out.println("exit thread B");
			}
		}
class C01  extends Thread
		{
			
			public void run()
			{
				System.out.println("thread C is started");
				for(int k=0;k<=10;k++)
				{
					System.out.println("thread C is running "+k);
				}
				System.out.println("exit thread C");
			}
		}


		public class SuspendResumeJoin{

			public static void main(String[] args) 
			{
				A01 obj1 = new A01();
				B01 obj2 = new B01();
				C01 obj3 = new C01();
				
				Thread t1 = new Thread(obj1);
				Thread t2 = new Thread(obj2);
				Thread t3 = new Thread(obj3);
				
				t1.start();
				t2.start();
				t3.start();
				
		
						
				t1.suspend();
			//	t1.resume();
				/*try 
				 * 
				{
					t1.join();
				} 
				catch (InterruptedException e)
				{
					
					e.printStackTrace();
				}*/
			    
			}

		



	}


