package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {

	public static void main(String[] args) 
	{
		List<String>list1 = new ArrayList<String>();
        list1.add("nitin");
        list1.add("aniket");
        list1.add("vishal");
        list1.add("nitin");
        
        
        System.out.println( Collections.frequency(list1, "nitin"));
        
        
        
	}     
	}

