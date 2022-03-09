package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		
		l1.add("Pratiksha");
		l1.add(1);
		l1.add(3.4);
		l1.add('a');
		
		System.out.println(l1);
		
		//using simple forloop display the elements
		
		for(int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		//using iterator 
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
       //using object----suppose we dont know which type of elements present in list
		
		for(Object obj1 :l1)
		{
			System.out.println(obj1);
		}
	}

}
