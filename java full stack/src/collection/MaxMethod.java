package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxMethod {

	public static void main(String[] args) 
	{
		List<Integer> list2 = new ArrayList();
        Collections.addAll(list2, 98,43,22,102);
        
        System.out.println(Collections.max(list2));
       System.out.println(Collections.min(list2));
       System.out.println(Collections.reverseOrder);


	}

}
