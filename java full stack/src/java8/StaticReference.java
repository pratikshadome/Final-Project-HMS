package java8;

interface Engine
{
	public abstract void speed();
	
}
class Car
{
	public static void average()
	{
		System.out.println("this is static method");
	}
}

public class StaticReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Engine obj1 = ()->System.out.println("this is abstract method");
              obj1.speed();
		
		      Engine obj2= Car::average;
		      obj2.speed();
	}

}
