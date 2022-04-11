package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisjointMethod {

	public static void main(String[] args) 
	{
            List<String>list1 = new ArrayList<String>();
            list1.add("nitin");
            list1.add("aniket");
            list1.add("vishal");
            list1.add("pallav");
            
            List<String> list2 = new ArrayList();
            
            // when there is no common element it returns true otherwise false
            
            Collections.addAll(list2, "madhuri","sapna","nushart","poonam");
            System.out.println(Collections.disjoint(list1, list2));
            
	}

}
