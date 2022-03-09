package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation 
{

	public static void main(String[] args) 
	{
		
		//using stream.of method
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9); 
		stream.forEach(p -> System.out.println(p));
		
		// using stream array method
		
		Stream<Integer>s1 = Stream.of(new Integer[] {10,20,30,40,50,60});
		s1.forEach(a->System.out.println(a));
		
		//using list
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
	    Stream<Integer>l1=list.stream();
	    l1.forEach(a->System.out.println(a));
	    
	    //using chars()
	    
	    IntStream s11 = "abcdefgr_123345".chars();
	    s11.forEach(p->System.out.println(p));


	}

}
