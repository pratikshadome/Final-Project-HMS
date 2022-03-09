package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linklist01 {

	public static void main(String[] args)
	{
       LinkedList<String> L01 = new LinkedList<String>();
		
		L01.add(new String("tree"));
		L01.add(new String("animal"));
		L01.add(new String("bird"));
		L01.add(new String("house"));
		L01.add(new String("city"));
		
		System.out.println(L01.get(0));
		System.out.println(L01.get(1));
		System.out.println(L01.get(2));
		System.out.println(L01.get(3));
		System.out.println(L01.get(4));
		
	}

}
