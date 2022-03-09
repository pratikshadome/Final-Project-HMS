package array;

public class TwoDimentionalArray01
{

	public static void main(String[] args) 
	{
		int matrix[][] = {{6,8,9},{2,3,4,},{4,5,6}};
		
		
		System.out.println("Elements are : ");
		
		for(int i = 0; i<matrix.length;i++)
		{
			for(int j = 0; j< matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] +  "\t");
				
			}
			System.out.println("");
		}
	}

}
