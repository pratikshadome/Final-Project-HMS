package multithreading;

class MyThread1 extends Thread 
{
 
    int sum = 0;
    public void run()
    {
        synchronized (this)
        {
      
            System.out.println( "child thread start calculation");
           for (int i = 0; i <= 100; i++) 
           {
                 sum += i;
           }
 
           System.out.println( "child thread trying to give notification");
            this.notifyAll();
        }
    }
}

class NotifyAll
{
 
    public static void main(String[] args)
    throws InterruptedException
    {
 
        MyThread1 t1 = new MyThread1();
        t1.start();
 
       
        synchronized (t1)
        {
        
            System.out.println(
                "main thread trying to call wait method");
 
       
     
            t1.wait();
 
      
            System.out.println("main thread get notify");
 
          
            System.out.println(t1.sum);
        }
    }
}
 
 
