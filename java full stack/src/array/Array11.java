package array;

import java.util.Scanner;

public class Array11
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of element");
		int n = sc.nextInt();
		int[]array= new int[n];
		
		for(int i = 0; i<array.length;i++)
		{
			System.out.println("enter the "+i+"th  element");
			array[i]     =  sc.nextInt();
			
		}
		
		System.out.println("elements are");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
