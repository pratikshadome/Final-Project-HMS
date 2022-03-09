package oops;

class Students
{
	int RollNo;
	String Name;
	double Marks;
     Students(int RollNo, String Name, double Marks)
     {
    	 this.RollNo = RollNo;
    	 this.Name = Name;
    	 this.Marks = Marks;
    	 
     }
     void show()
     {
    	 System.out.println("roll number of student is "+RollNo);
    	 System.out.println("name of student is "+Name);
    	 System.out.println("marks of student is "+Marks);
    	 System.out.println("\n.................................................................................................");
     }
     void display()
     {
    	 System.out.println(RollNo+ " " +Name+ " "+Marks);
     }
   
}

public class ParameterizedConstructor02
{

	public static void main(String[] args) 
	{
		
           Students s1 = new Students(101,"shital",80.34);
           Students s2 = new Students(102,"Nital",98.99);
           s1.show();
           s2.show();
           s1.display();
           s2.display();
	}

}
