package inhritance;

interface A
{
	public default void animal()
	{
		System.out.println("animals are loyal");
	}

}
class XXX
{
	public void tree()
	{
		System.out.println("trres are green");
	}
}

public class DefalutInterface extends XXX implements A
{
	
    public void animal()
	{
   
		A.super.animal();
		System.out.println("animals are loyal");
	}
       
	  

	public static void main(String[] args) 
	{
		DefalutInterface obj1 = new DefalutInterface();
		obj1.tree();
		obj1.animal();
		
		
		// TODO Auto-generated method stub
	}
	
}

	