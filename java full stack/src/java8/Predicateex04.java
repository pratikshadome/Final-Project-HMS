package java8;

import java.util.function.Predicate;

public class Predicateex04 {

	public static void main(String[] args)
	{
          Predicate<String>name = Predicate.isEqual("mumbai");
          System.out.println(name.test("delhi"));
          
	}

}
