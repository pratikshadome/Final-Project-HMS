package oops;

class Student

{
	int rollno;
	String name;
	static String college = "snd";
	
	Student(int r,String n)
	{
		rollno =r ;
		name=n;
		
	}
    void print()
	{
		System.out.println(rollno+ "" +name+ "" +college);
	}
}

public class StaticVariable {

	public static void main(String[] args)
	{
		Student s = new Student(101, " Pratiksha ");
		Student s1 = new Student(102, " madhuri ");
		
		s1.print();
		s.print();
		
		
	}

}
