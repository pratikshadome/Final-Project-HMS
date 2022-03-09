package polymorphism;

class XYZ

{
	public void display(int l)
	{
		System.out.println("area of square is  = "+(l*l));
	}
	public void display(float l ,int b, int h )
	{
		System.out.println("area of triangle is = "+(l*b*h));
		
	}
}
class ABC

{
	public void display(String s)
	{
		System.out.println("display string is"+s);
	}
	public void display(char a, double b )
	{
		System.out.println("display value of a is =" +a);
		System.out.println("display value of b is =" +b);
		
	}
}



public class MethodOverloading {

	public static void main(String[] args)
	{
		XYZ obj1 = new XYZ();
		obj1.display(10);
		obj1.display(0.5f,4,5);
		
		ABC obj2 = new ABC();
		obj2.display("Happly Valentines Day");
		obj2.display('A',22.44);
		
	}

}
