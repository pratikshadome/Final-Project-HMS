package array;

public class ArrayPassing01
{
	public static void print(int [] arry)
	{
		
		for (int i = 0; i<arry.length;i++)
		{
			System.out.println(arry[i]+"");
			
		}
			
	}

	public static void main(String[] args)
	{
		
		int [] data = {10,20,30,40,50};
		
		print(data);
	}

}
