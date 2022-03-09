package collection;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) 
	{
		Map <String,String> flv = new HashMap<String,String>();
		
		flv.put("rose","red");
		flv.put("mogra", "white");
		flv.put("lotus", "pink");
		flv.put("jai", "black");
		flv.put("zendu", "orange");
		
		
		System.out.println(flv);
		
		System.out.println("rose is "+flv.get("rose"));
		System.out.println("mogra is "+flv.get("mogra"));
		System.out.println("lotus is "+flv.get("lotus"));
		System.out.println("jai is "+flv.get("jai"));
		System.out.println("zendu is "+flv.get("zendu"));

	System.out.println("..........................................................");	
		
		for (String key :flv.keySet())
		{
			System.out.println(key +":"+flv.get(key));
			
			
			
		}
		
	}

}
