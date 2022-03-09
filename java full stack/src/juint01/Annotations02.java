package juint01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Annotations02
{ 
     
     @After
     public void show()
     {
    	 System.out.println("after class method");
     }
     @Test
     public void display()
     {
    	 System.out.println("this is test method");
     }
     @Before	
     public void input()
     {
   	  System.out.println("before class method");
     }

}
