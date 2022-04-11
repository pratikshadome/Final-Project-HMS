package string;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args)
	{
           Scanner sc = new Scanner(System.in);
           System.out.println("enter string of character");
           String s1 = sc.next();
           System.out.println("enter string");
           String s2 = sc.next();
           
           int count = 0;
           String[]s3 = s1.split("");
           
           for(int i=0;i<s1.length();i++)
           {
        	   if(s3[i].equals(s2))
        	   {
        		   count = count + 1 ;
        	   }
           }System.out.println("enter character  " +s2+ " count is "  +count);
	}

}
