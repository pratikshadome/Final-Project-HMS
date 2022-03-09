package oops;

class Area
{
	// area of square
	public Area(int l)
	{
		System.out.println("\n...........................");
		System.out.println("Print value of l is "+l);
		System.out.println("area of square is "+(l*l));
	}
	 public Area(int l,int h)
	{
		// area of rectangle
		System.out.println("\n...........................");
		System.out.println("Print value of l is "+l);
		System.out.println("Print value of h is "+h);
		System.out.println("area of rectangle is "+(l*h));
	}
      public Area(int b,double h)
	{
		// area of tringle
		System.out.println("\n...........................");
		System.out.println("Print value of b is "+b);
		System.out.println("Print value of h is "+h);
		System.out.println("area of triangle is "+(0.5*b*h));
	}
	
}

public class ConstructorOverL
{

	public static void main(String[] args)
	{
		Area obj1 = new Area(12);
		Area obj2 = new Area(5,6);
		Area obj3 = new Area(6,2.44);

	}

}
