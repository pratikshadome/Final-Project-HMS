package oops;

class Parameter
{
	int id;
	String name;
	Parameter(int id, String name)
	{
		this.id = id;
		this.name = name;
	}	
		void display()
		{
			System.out.println(id+ " " +name);
		}
	
	
}

public class ParameterizedConstructor {
	

	public static void main(String[] args) 
	{
		Parameter obj1 = new Parameter(1,"Pratiksha");
		Parameter obj2 = new Parameter(2,"Dome");
		obj1.display();
		obj2.display();
		
		

	}

}
