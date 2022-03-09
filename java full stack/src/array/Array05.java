package array;
class Std
{
    String name ;
	int rollno;
	
    Std( int r, String n)
    {
    	rollno = r;
    	name = n;
    }
}

public class Array05
{

	public static void main(String[] args) 
	{
		Std data[] = new Std[5];
		
		 data[0]= new Std (1 , "Pratiksha");
		 data[1]= new Std (2 , "Priya");
		 data[2]= new Std (3 , "Prajakta");
		 data[3]= new Std(4 , "Pranali");
		 data[04]= new Std (5 , "Pranita");
		 
		 for(int i = 0; i<data.length;i++)
		 {
			 System.out.println("elements are  "+i+ " : "+data[i].rollno+ "  "+data[i].name );
		 }
				
	}

}
