package junit;

class Student 
{
     void data()
     {
    	 System.out.println("students data");
     }
}
class College extends Student
{
	@Override
	 void data()
	 {
		 System.out.println("college data");
	 }
}
public class Builtinanno {

	public static void main(String[] args)
	{
         College obj = new College();
         obj.data();
         
	}

}
