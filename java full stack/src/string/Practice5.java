
//occurance od each character in a string

package string;

import java.util.HashMap;

public class Practice5 {

	public static void main(String[] args)
	{
        String s = "java";
        
        int count =0;
        char ch;
        
        HashMap<Character,Integer> hashmap= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
        	ch = s.charAt(i);
        	if(hashmap.containsKey(ch))
        	{
        		count = hashmap.get(ch);
        		count++;
        		hashmap.replace(ch, count);
        		
        	}else
        	{
        		hashmap.put(ch, 1);
        	}
        }
        for(Character key : hashmap.keySet())
        {
        	System.out.println(key+"    =    "+hashmap.get(key));
        }
	}

}
