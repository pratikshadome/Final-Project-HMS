package array;


import java.util.ArrayList;

import java.util.Collections;

public class ShuffleArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		numbers .add(3);
		numbers .add(4);
		numbers .add(5);
		numbers .add(7);
		numbers .add(10);
		numbers .add(34);
		numbers .add(44);
		
		System.out.println("numbers before shuffled "+numbers);
		Collections.shuffle(numbers);
		System.out.println("numbers after shuffled "+numbers);
		
		
		
		

	}

}
