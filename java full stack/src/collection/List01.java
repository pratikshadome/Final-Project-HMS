package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args)
	{
		//it accpets the all elements but in oredred manner
		
	       List<String> L1 = new ArrayList();	
	       
	       L1.add("mumbai");
	       L1.add("11");
	       L1.add("delhi");
	       L1.add("22");
	       L1.add("uran");
	       
	       L1.add("mumbai");
	       L1.add("11");
	       L1.add("delhi");
	       L1.add("22");
	       L1.add("uran");
	       
	       for(int i=0;i<L1.size();i++)
	       {
	    	   System.out.println(L1.get(i));
	       }
	      
	  /*     
	       Collections.sort(L1);
	       System.out.println(L1);
	       
	       Collections.shuffle(L1);
	       System.out.println(L1);*/
	       
	}

}
