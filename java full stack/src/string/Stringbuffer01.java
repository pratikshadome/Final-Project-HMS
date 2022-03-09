package string;

public class Stringbuffer01 {

	public static void main(String[] args) 
	
	{
		    //print string using stringbuffer
		
		StringBuffer s1 = new StringBuffer("Welcome to india");
		System.out.println("actual string is : "+s1);
	
	        // calculate the length of string s1
		
		System.out.println("length of string is : "+s1.length());
		
		   // calculate the position of each character with their index
		
		for (int i = 0 ; i<s1.length();i++)
		{
			int position = i+1;
			
			System.out.println("character at position  "+position+""+s1.charAt(i) );
			}
			
		   //convert stringbuffer into string
		
			StringBuffer s2 = new StringBuffer(s1.toString());
			
		  // using indexof method find out index of india
			
			int x = s2.indexOf("india");
			
		 // using insert method insert pratiksha string into original string
			
			s1.insert(x, "Pratiksha");
			System.out.println("modified string is : "+s1);
			
			//using setcharAt method set - at the index of 7th
			
			s1.setCharAt(7,'-');
			System.out.println("modified string is  "+s1);
			
			//use the method append
			
			s1.append("is a very beautiful contry");
			
			System.out.println("modified string is  "+s1);
			
			
			
			
		}
	}


