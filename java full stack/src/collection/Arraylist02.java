package collection;

import java.util.ArrayList;

public class Arraylist02 {

	public static void main(String[] args) 
	{
		ArrayList<String> arr01 = new ArrayList<String>();
		
		arr01.add(new String("tree"));
		arr01.add(new String("animal"));
		arr01.add(new String("bird"));
		arr01.add(new String("house"));
		arr01.add(new String("city"));
		
		System.out.println(arr01.get(0));
		System.out.println(arr01.get(1));
		System.out.println(arr01.get(2));
		System.out.println(arr01.get(3));
		System.out.println(arr01.get(4));
		
	}

}
