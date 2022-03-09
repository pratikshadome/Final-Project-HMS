package inhritance;

class P
{
   public void show()
   {
      System.out.println("show method of class P");
   }
}
class Q extends P
{
   public void show01()
   {
      System.out.println("show01 method of Class Q");
   }
}
class R extends Q
{
  public void show02()
  {
     System.out.println("show02 method of Class R");
  }
}
class S extends R
{
  public void show03()
  {
     System.out.println("show03 method of Class S");
  }
}
public class Hierarchicalinheritance
{
  public static void main(String args[])
  {
     Q obj1 = new Q();
     R obj2 = new R();
     S obj3 = new S();
     //All classes can access the method of class A
     obj1.show01();
     obj2.show02();
     obj3.show03();
  }
}
 

	
