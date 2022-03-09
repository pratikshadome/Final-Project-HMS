package inhritance;

class CCC
{
   public void function1()
   {
	System.out.println("CCC");
   }
}

class AAA extends CCC
{
   public void function2()
   {
	System.out.println("AAA");
   }
}

class BBB extends CCC
{
   public void function3()
   {
	System.out.println("BBB");
   }
	
}


class DDD extends AAA
{
   public void function4()
   {
	System.out.println("DDD");

   }
}
  
   
    
   public class HybridInheritance {
   
   public static void main(String args[]){

	DDD obj = new DDD();
	BBB obj1 = new BBB();
	
	obj1.function3();
	
	obj.function1();
	obj.function2();
	obj.function4();
   }
}


	

