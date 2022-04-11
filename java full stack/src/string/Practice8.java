package string;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args)
	{
          Scanner sc = new Scanner(System.in);   
          int count =0;
          System.out.println("enter string");
          String s1 = sc.next();
          System.out.println("enter substring");
          String s2 = sc.next();
         // for(int i = 0; i<s1.count;i++)
        	  
          {
          if(s1.contains(s2))
          {
        	  count = count+1;
        	  System.out.println(count);
          }
          
          else
          {
        	  System.out.println("zero");
          }
          }
}
}