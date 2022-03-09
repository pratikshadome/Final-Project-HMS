package collection;

import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) 
	{
		Vector <String> vc = new Vector<String>();
		
		vc.add("a");
		vc.add("b");
		vc.add("c");
		vc.add("d");
		vc.add("e");
		vc.add("f");
		
		System.out.println(vc);
		
		System.out.println("vector size " +vc.size());
		
		System.out.println("vector capacity " +vc.capacity());
		
		System.out.println(vc.contains("d"));
	}

}