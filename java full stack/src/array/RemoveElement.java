package array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) 
	{
		int myarray[]= {34,56,33,88,99,};
		
		System.out.println("Print Original Array : "+Arrays.toString(myarray));
		
		int remove = 3;
		
		for(int i = remove; i<myarray.length-1;i++)
		{
			myarray[i] = myarray[i]+1;
		}
		
		System.out.println("array after removing element : "+Arrays.toString(myarray));
	}

}
