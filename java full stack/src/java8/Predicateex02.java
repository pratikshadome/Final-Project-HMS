package java8;

import java.util.function.Predicate;

public class Predicateex02 
{

	public static void main(String[] args)
	{
            Predicate<Integer>p = addition-> addition==100;
            System.out.println(p.test(100));
            System.out.println(p.test(80));
	}

}
