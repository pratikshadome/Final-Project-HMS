package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args)
	{
		Set s01 = new TreeSet();
		
		s01.add("apple");
		s01.add("chikku");
		s01.add("papaya");
		s01.add("banana");
		s01.add("watermelon");
		
		Iterator iterator = s01.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
