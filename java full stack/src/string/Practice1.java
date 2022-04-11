//make given string to reverse 

package string;

public class Practice1 {

	public static void main(String[] args) 
	{
                String s1 = "Pratiksha";
                String rev = "";
                 
                for (int i =s1.length()-1;i>=0; i-- )
                {
                	rev = rev + s1.charAt(i);
                }
                System.out.println("input string is :"+s1);
                System.out.println("reverse string is :"+rev);
	}
	

}
