package java8;

import java.util.function.Function;

public class Functionalex01 {

	public static void main(String[] args)
	{
            Function<String,Integer> fun = s->s.length();
            System.out.println(fun.apply("pratiksha"));
            
            Function<Integer,Integer> sum = i->i+i;
            System.out.println(sum.apply(6));
            
            }
}
