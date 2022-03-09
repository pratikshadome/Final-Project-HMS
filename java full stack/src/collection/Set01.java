package collection;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		
		//here its accepts only unique values
		
		   s1.add("mumbai");
	       s1.add("11");
	       s1.add("delhi");
	       s1.add("22");
	       s1.add("uran");
	       s1.add("anagar");
	       
	       
	       s1.add("mumbai");
	       s1.add("11");
	       s1.add("delhi");
	       s1.add("22");
	       s1.add("uran");
	       s1.add("anagar");
	       
	       System.out.println(s1);
	       
		
	}

}
