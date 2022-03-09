package string;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) 
	{
		StringJoiner s1 = new StringJoiner(" - ");
		
		s1.add("Pratiksha");
		s1.add("Vijay");
		s1.add("Dome");
		
		System.out.println("joined string is : "+s1);


}
}