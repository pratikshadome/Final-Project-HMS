package array;

import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	Student(int r,String nm)
	{
		rollno = r;
		name = nm;
	}
}


public class Array04 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("how many students data you want?");
		int n = sc.nextInt();
		int r[]=new int[n];
		String nm[]=new String[n];
		Student data[] = new Student[n];
		
		System.out.println("roll no of students is");
		for (int i = 0; i< r.length; i++)
		{
		   r[i] = sc.nextInt();
		
		}
		System.out.println("name no of students is");
		for (int i = 0; i< nm.length; i++)
		{
		   nm[i] = sc.next();
		
		}
		System.out.println("total data of students is");
		for (int i = 0; i< data.length; i++)
		{
		   System.out.println(i+":"+data[i].rollno+ ""+data[i].name);
		}
	}

}
