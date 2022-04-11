package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddMethod {

	public static void main(String[] args) 
	{
              List<String> list = new ArrayList<String>();
              
              list.add("pratiksha");
              list.add("nital");
              
              Collections.addAll(list,"prashant","shital","nital");
              System.out.println(list);
              
              //binary search
              
              System.out.println(Collections.binarySearch(list, "prashant"));
              
	}

}
