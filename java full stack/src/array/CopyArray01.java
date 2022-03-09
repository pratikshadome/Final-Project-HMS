package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CopyArray01 {

	public static void main(String[] args)
	{
		ArrayList <String> zoo = new ArrayList<String>();
		
		zoo.add("tiger");
		zoo.add("lion");
		zoo.add("elephant");
		
		ArrayList <String> fruit = new ArrayList<String>();
		
		fruit.add("banana");
		fruit.add("apple");
		fruit.add("chikkkkku");
		
		Collections.copy(fruit,zoo);
		System.out.println(fruit);
		
		
		
	}

}
