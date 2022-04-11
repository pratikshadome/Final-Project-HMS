package string;

public class PracticeCompareToStrings 
{

	public static void main(String[] args) 
	{
                String s1 = "my name is pratiksha";
                String s2 = "my name is pratiksha";
                
                System.out.println("string s1 is : "+s1);
                System.out.println("string s2 is : "+s2);
                
                int Result = s1.compareToIgnoreCase(s2);
                
                if(Result < 0)
                {
                	System.out.println("string s1 " +s1+ "is less than string s2 "+s2);
                }
                else if(Result == 0 )
                {
                	System.out.println("string s1 "+s1+ "is equals to string s2 "+s2);
                } 
                else
                {
                	System.out.println("string s1 "+s1+ " is greater than string s2  "+s2);

                }
                
                
	}

}
