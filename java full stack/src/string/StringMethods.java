package string;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s1 = "HELLO";
		String s2 = "pratiksha is a good girl";
		
	    System.out.println(" s1 string lengh is = "+s1.length());
	    
	    System.out.println("in string s1 character at 2nd location is = "+s1.charAt(2));
	    
	    System.out.println("concatation of s1 and s2 is = "+s1.concat(s2));
	    
	    System.out.println("substring of s2 is = "+s2.substring(2));
	    
	    System.out.println("substring of s1 is = "+s1.substring(0, 3));
	    
	    System.out.println("index of good is = "+s2.indexOf("good"));
	    
	    System.out.println("string s1 in lowercase = "+s1.toLowerCase());
	    
	    System.out.println("string s2 in uppercase = "+s2.toUpperCase());
	    
	    System.out.println("string s2 trimming = "+s2.trim());
	    
	    System.out.println("old character replace to new character = "+s2.replace("g","f"));
	    
	    
	    
	}

}
