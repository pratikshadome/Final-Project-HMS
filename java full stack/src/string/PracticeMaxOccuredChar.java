package string;

public class PracticeMaxOccuredChar {
	
	static int ascii_size= 256;
	/*static void maxoccuringchar(String s1)
	{
		int n1 = s1.length();
		int count[]=new int [ascii_size];
		
		for(int i=0;i<n1;i++)
		{
			count[s1.charAt(i)]++;
			
			int max =-1;
			char result=' ';
			//traversing through the string and maintain the countf of every character
			
			for(i=0;i<n1;i++)
			{
				if(max < count[s1.charAt(i)]) 
				{
					max= count[s1.charAt(i)];
					result = s1.charAt(i);
					
				}
					

		}	
	}	

	
		
		
		
}*/

	public static void main(String[] args)
	{
                    String s1 = "fooooooooooooooooood ";
                    System.out.println("string is "+s1);
                   char result = ' ';
                    int n1 = s1.length();
            		int count[]=new int [ascii_size];
            		
            		for(int i=0;i<n1;i++)
            		{
            			count[s1.charAt(i)]++;
            			
            			int max =-1;
            		
            			//traversing through the string and maintain the countf of every character
            			
            			for(i=0;i<n1;i++)
            			{
            				if(max < count[s1.charAt(i)]) 
            				{
            					max= count[s1.charAt(i)];
            					result = s1.charAt(i);
            					
            				}
            					

            		}	
            	}	System.out.println("maximum occuring character is " +result);

	}				


}
