package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations
{
	@After
       public void input1()
       {
    	   System.out.println("after annotation");
       }
	@Test
       public void output()
       {
    	   System.out.println("test annotation");
       }
	@Before
       public void show()
       {
    	   System.out.println("before annotation");
       }
}

class ABC
{
	@BeforeClass
	public static void display()
    {
 	   System.out.println("before class annotation");
    }
	@AfterClass
	public static void print()
	{
		System.out.println("after class annotations");
	}
}
       
      

