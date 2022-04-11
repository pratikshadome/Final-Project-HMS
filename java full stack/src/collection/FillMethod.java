package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMethod {

	public static void main(String[] args) 
	{
		List<String>list1 = new ArrayList<String>();
        list1.add("nitin");
        list1.add("aniket");
        list1.add("vishal");
        list1.add("pallav");
        
        System.out.println(list1);
        
        Collections.fill(list1, "arti");
        
        System.out.println(list1);
        
	}

}
