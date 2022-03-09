package java8;

interface Engine22
{
	public abstract void speed();
	
}
class Car02
{
	public Car02()
	{
		System.out.println("this is constructor of class");
	}
}

public class ConstructorRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine22 obj1 = ()->System.out.println("this is abstract method");
        obj1. speed();
        
        Engine22 obj = Car::new;
        obj.speed();
        
        
	}

}
