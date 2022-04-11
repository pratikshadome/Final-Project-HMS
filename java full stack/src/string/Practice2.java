package string;

public class Practice2 
{

	public static void main(String[] args)
	{
                   String s2 = "madam";
                   String reverse = "";
                   
                   for(int i = s2.length()-1; i >= 0 ; i--)
                   {
                	   reverse = reverse + s2.charAt(i);
                	   
                   }	   
                	   if(s2.equals(reverse))
                	   {
                		   System.out.println("string is palindrome");
                	   }
                	   else
                	   {
                		   System.out.println("string is not palindrome");
                	   }
                   
	}

}
