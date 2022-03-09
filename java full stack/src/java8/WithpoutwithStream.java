package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithpoutwithStream {

	public static void main(String[] args) 
	{
            List<Integer> list1 = new ArrayList();
            List<Integer> even = new ArrayList();
            
            list1.add(12);
            list1.add(20);
            list1.add(7);
            list1.add(6);
            list1.add(13);
            for(int i= 0 ;i<list1.size();i++)
            {
            	if(i%2==0)
            	{
            		even.add(i);
            	}
            }System.out.println(list1);
            System.out.println(even);
            
            
            
          //Stream <Integer> stream =list1.stream();
         //List<Integer> newlist= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
          // System.out.println(newlist); 	
           
         List<Integer>stream1= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
         System.out.println(stream1);
	}

}



//using Stream API


           