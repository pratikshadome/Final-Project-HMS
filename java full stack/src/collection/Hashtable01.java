package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable01 {

	public static void main(String[] args)
	{
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		ht.put("four", 4);
		ht.put("five", 5);
		
		
		System.out.println("table of contents :" +ht);
		
		Set s = ht.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+ " " +m.getValue());
			
		}
	}
}