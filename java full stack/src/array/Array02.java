package array;

import java.util.Scanner;

public class Array02
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want enter");
		int n = sc.nextInt();
		int xyz[] = new int [n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<xyz.length;i++)
		{
			xyz[i]=sc.nextInt();
		}
		System.out.println("elements are");
		for(int i=0;i<xyz.length;i++)
		{
			System.out.println(xyz[i]);
		}
	}

}
