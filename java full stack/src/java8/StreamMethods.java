package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods 
{

	public static void main(String[] args) 
	{
		
		    //using filter i will perform operation
		
		
             List<String> l1 = List.of("Pratiksha","Prajakta","monika","Priya","Sejal");
             
             List<String> newlist= l1.stream().filter(i->i.startsWith("P")).collect(Collectors.toList());
             System.out.println(newlist);
            
             
             //using filter calculate square of numbers
             
             ArrayList<Integer>a1 = new ArrayList();
             a1.add(2);
             a1.add(3);
             a1.add(4);
             a1.add(5);
             a1.add(6);
             a1.add(7);
             
             System.out.println(a1);
             
            List<Integer>a2= a1.stream().map(i->i*i).collect(Collectors.toList());
            System.out.println(a2);
           
            //using max method calculate maximum value in arraylist
            
          Integer a3=a1.stream().max((x,y)->x.compareTo(y)).get();
           System.out.println("max value is :"+a3);
           
           //using max method calculate maximum value in arraylist

           Integer a4=a1.stream().min((x,y)->x.compareTo(y)).get();
           System.out.println("min value is :"+a4);
           
           //using map method print the square of elements
           
           
           List<Integer> number = Arrays.asList(2,3,4,6,7,8,9);
           number.stream().map(x->x*x).collect(Collectors.toList());
           System.out.println("square of elements is " +number);
           
           
           //using sort method string sortig performed
           
           List<String> names = Arrays.asList("Pratiksha","mumbai","Aurangabad","uran");
          List result= names.stream().sorted().collect(Collectors.toList());
           System.out.println("sorted elements are :"+result );
           
           
           List num=Arrays.asList(10,20,30,40,50);
        // List output = num.stream().map(x->x * x).forEach(e->System.out.printlne(e));
           
           
           List no = Arrays.asList(2,3,4,5,6);
           //no.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
           
           List <Integer>list11=Arrays.asList(24,45,67,98,42,56);
           IntSummaryStatistics stat = list11.stream().collect(Collectors.summarizingInt(i->i+i));
           System.out.println("sum is :"+stat.getSum());
           System.out.println("count is :"+stat.getCount());
           System.out.println("max is :"+stat.getMax());
           System.out.println("min is :"+stat.getMin());
           System.out.println("average is :"+stat.getAverage());
        		   
             
            
   }

}
