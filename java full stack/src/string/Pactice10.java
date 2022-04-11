package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Pactice10 
{

	public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string");
            String s = sc.nextLine();
            String[] s1= s.split("");
            List <String> list = new ArrayList();
            for(int i = 0; i<s1.length;i++)
            {
            	if(!list.contains(s1[i]))
            	{
            		list.add(s1[i]);
            		
            	}
            }
            Iterator itr = list.iterator();
            while(itr.hasNext())
            {
            	System.out.print(itr.next());
            }
            

     }
}	