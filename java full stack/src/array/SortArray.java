package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements you want to enter");
		int N = sc.nextInt();
		int[] arr01 = new int [N];
		
		System.out.println("enter elements");
		for(int i=0;i<arr01.length;i++)
		{
			arr01[i] = sc.nextInt();
		}
		System.out.printf("array before sorting : ");
		System.out.println(Arrays.toString(arr01));
		
		Arrays.sort(arr01);
		
	    System.out.printf("array after sorting : "+Arrays.toString(arr01) );
		
	}
}


