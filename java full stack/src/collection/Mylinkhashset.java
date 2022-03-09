package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Mylinkhashset {

	public static void main(String[] args)
	{
		LinkedHashSet <String> L1 = new LinkedHashSet <String>();
		
	    L1.add("one");
	    L1.add("two");
	    L1.add("three");
	    L1.add("four");
	    
	    Object array[] = L1.toArray();
	    
	    for (int i = 0; i<4;i++)
	    {
	    	System.out.println(array[i]);
	    }
	    
	    
	}

}
