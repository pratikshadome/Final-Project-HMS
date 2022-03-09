package java8;

import java.util.function.Predicate;

public class Predicateex03 
{

	public static void main(String[] args) 
	{
             int a[] = {1,2,3,4,5,6,7,8,9,10};
             Predicate<Integer>even= x -> x % 2==0;
             Predicate<Integer>grt= y->y>5;
             
             for(int i: a)
             {
            	 if(grt.or(even).test(i))
            	 {
            		 System.out.println(i);
            	 }
             }
	}

}
