package collection;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> h1 = new HashMap<String,Integer>();
		
		h1.put("capgemini", 1);
		h1.put("tcs", 2);
		h1.put("accenture", 3);
		h1.put("infosys", 4);
		h1.put("hcl", 5);
		
		System.out.println("capgemni is " +h1.get("capgemini"));
		System.out.println("tcs is " +h1.get("tcs"));
		System.out.println("accenture is " +h1.get("accenture"));
		System.out.println("infosys is " +h1.get("infosys"));
		System.out.println("hcl is " +h1.get("hcl"));
		
	}

}
