package inhritance;


interface sample
{
	final int a = 77;
	final int b = 88;
	abstract public int addition();
	public int show();
	
}
interface sample2
{
	public int display();
	
}
class X
{
	public void print()
	{
		System.out.println("hellllllo");
		
	}
}
public class MultipleInheritance extends X implements sample,sample2
{

	public static void main(String[] args) 
	{
		MultipleInheritance obj1= new MultipleInheritance();
		obj1.print();
		obj1.show();
		obj1.display();
		obj1.addition();
		
}

	@Override
	public int display() {
		int a = 2;
		int b = 3;
		System.out.println(a+ ""+b);
		return 0;
	}

	@Override
	public int addition() {
		int a=2;
		int b=5;
		System.out.println("addition of a and b is"+(a+b));
		return 0;
	}

	@Override
	public int show() {
		System.out.println("show method was executed");
		return 0;
	}


	}	