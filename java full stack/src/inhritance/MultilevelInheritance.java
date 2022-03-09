package inhritance;

import java.util.Scanner;

class Patiant
{
	int number;
	String name;
	Scanner sc = new Scanner(System.in);
	public void input1()
	{
		System.out.println("number of patient is");
		number = sc.nextInt();
		System.out.println("name of patient is");
		name = sc.next();
		
	}
	public void display1()
	{
		System.out.println("Number = ");
		System.out.println("Name = ");
		
	}
}
class Doctor extends Patiant
{
	String name;
	int experience;
	String education;
	Scanner sc = new Scanner(System.in);
	public void input2()
	{
		System.out.println("name of doctor is ");
		name = sc.next();
		System.out.println("experience of doctor is ");
		experience = sc.nextInt();
		System.out.println("education of doctor is  ");
		education = sc.next();
		
	}
	public void display2()
	{
		System.out.println("Name = ");
		System.out.println("Experience = ");
		System.out.println("Education = ");
	
	}

}
class Hospital extends Doctor
{ 
	int floor;
	int doctors ;
	Scanner sc = new Scanner(System.in);
	public void input3()
	{
		System.out.println("name of hospital is ");
		name = sc.next();
		System.out.println("floor in hospital is ");
		floor = sc.nextInt();
		
	}
	public void display3()
	{
		System.out.println("Name = ");
		System.out.println("floor = ");
		
	}
}


public class MultilevelInheritance {

	public static void main(String[] args)
	{
		
		Hospital obj1 = new Hospital();
		
		
		obj1.input1();
		obj1.input2();
		obj1.input3();
		
		obj1.display1();
		obj1.display2();
		obj1.display3();
		
	}

}
