package string;

import java.util.Arrays;

public class PracticeRemoveDuplicates {
	
	static String removeduplicates(char[] str,int n)
	{    
		int index = 0;

		for(int i = 0; i<n; i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
			if (j==i)
				
			{
				str[index++] = str[i];

			}
			}
		}
	
		return String.valueOf(Arrays.copyOf(str, index));
		
	}

	public static void main(String[] args) 
	{
               char str[]="mood_food_good".toCharArray();
               int n = str.length;
               System.out.println(removeduplicates(str,n));
                
	}

}
