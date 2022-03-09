package java8;

import java.util.function.Predicate;

interface demo
{
	/*public default boolean test(Integer age)
	{
         if(age>21)
         {
        	 return true;
        	 
         }else
         {
        	 return false;
         }
	}*/
	
}
public class PredicateEx 
{

	public static void main(String[] args) 
	{
		Predicate<Integer> p = age->(age>21);
		System.out.println(p.test(15));
		System.out.println(p.test(25));

	}

}
