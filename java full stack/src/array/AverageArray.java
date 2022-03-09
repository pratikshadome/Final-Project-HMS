package array;

public class AverageArray {

	private static final int i = 0;

	public static void main(String[] args) 
	{
	
		int num[] = {2,4,6,8,1,3,5,7,9,};
		
		System.out.println("elements are :");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(+num[i]);
		}
		
		int length=num.length;
		System.out.println("lengh of array is "+length);
		
		
		int sum = 0;
	    sum +=num[i];
	    
		System.out.println("sum of array is :");
		for(int i = 0; i<num.length;i++)
		{
			System.out.println(sum+=num[i]);
		}
		
		int avg1 = sum /length;
		System.out.println("average is :"+avg1);
		
	}

}
