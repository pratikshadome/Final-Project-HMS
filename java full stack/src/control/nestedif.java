package control;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age of person");
		age = sc.nextInt();
		System.out.println("enter weight of person");
		weight = sc.nextInt();
		if(age>=21)
		{
			if(weight>=50)
			{
				System.out.println("you are eligible for blood donation");
			}
			
		}else
		{
			System.out.println("you are not elijible for blood donation");
		}
	}
	

}
