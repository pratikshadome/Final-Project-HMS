package control;

import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		if(marks<=50)
		{
			System.out.println("fail");
		}else if( marks >=50 && marks <= 60)
		{
			System.out.println("Grade c");
		}else if( marks >=60 && marks <= 70)
		{
			System.out.println("Grade b");
		}else if( marks >=70 && marks <= 80)
		{
			System.out.println("Grade a");
		}else
		{
			System.out.println("invalid grade");
		}

	}

}
