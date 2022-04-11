//count total number of characters occuring in a string

package string;

public class Practice4 {

	public static void main(String[] args) 
	{
           String s = "pratiksha is very intelligent girl ";
           
           int count=0;
           
           for(int i=0; i<s.length();i++)
           {
        	   if(s.charAt(i)!=' ')
        	   {
        		   count++;
        	   }
           }System.out.println("count od character is : "+count);
	}

}
