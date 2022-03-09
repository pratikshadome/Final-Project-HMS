package array;

import java.util.Arrays;

public class CopyArray 
{

	public static void main(String[] args) 
	{
		int array01[] = {10,20,30,40,50};
		
		int array02[] = new int[array01.length];
		
/*		for(int i = 0; i<array01.length;i++)
		{
			array02[i] = array01[i];
			
		}
		System.out.println("Print element of first array is : "+Arrays.toString(array01));
		/*for(int i =0; i<array01.length;i++)
		{
			System.out.println("");
		}*/
		
		
		/*for(int i =0; i<array01.length;i++)
		{
			System.out.println("");
		}*/
       System.arraycopy(array01, 0, array02, 0, array01.length);
       System.out.println("Print element of second array is : "+Arrays.toString(array02));

	}

}
