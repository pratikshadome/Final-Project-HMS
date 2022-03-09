
//1. Write a Java program to compare two strings lexicographically,
//ignoring case differences2. 


package string;

public class Assignment01
{
	public static void main(String[] args)
    {
        String s1 = "welcome in india";
        String s2 = "welcome in maharashtra";
        
        System.out.println("String 1 is : " + s1);
        System.out.println("String 2 is : " + s2); 
       
        
        int comparision = s1.compareTo(s2);

        
        if (comparision < 0)
        {
            System.out.println("s1 is less than s2");
        }
        else if (comparision == 0)
        {
            System.out.println("s1 is equal to s2");
        }
        else 
        {
            System.out.println("s1 greater than s2");
        }
    }
}


