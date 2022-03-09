package java8;

interface Engine01
{
	public abstract void speed();
	
}
class Car01
{
	public void average()
	{
		System.out.println("this is instance method");
	}
}


public class InstanceReferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Engine obj1 = ()->System.out.println("this is abstract method");
            obj1. speed();
            
            Car01 car = new Car01();
            Engine01 obj2 = car::average;
            
	}

	}
