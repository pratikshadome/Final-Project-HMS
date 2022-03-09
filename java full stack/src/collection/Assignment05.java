package collection;

import java.util.LinkedList;

public class Assignment05 


{
	private LinkedList<Integer> list = new LinkedList<Integer>();
	
	public LinkedList<Integer> saveEvenNumbers(int N)
	{
		list = new LinkedList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public LinkedList<Integer> printEvenNumbers()
	{
		LinkedList<Integer> newList = new LinkedList<Integer>();
		
		for (int item : list) 
		{
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}

	public static void main(String[] args)
	{
	Assignment05 obj = new Assignment05();
		obj.saveEvenNumbers(10);
		obj.printEvenNumbers();

	}
	
	}


