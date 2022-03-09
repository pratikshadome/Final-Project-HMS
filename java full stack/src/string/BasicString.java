package string;

import java.lang.*;


public class BasicString 
{

	public static void main(String[] args) 
	{
		String str = "Pratiksha";
		System.out.println("Name is "+str);
		
		
		char chars[]= {'h','e','l','l','o'};
		String str0 = new String(chars);
		System.out.println("statement is "+str0);
		
		
		String str1 = new String("Pune University");
		System.out.println("University is "+str1);
		
		byte ascChars[] = {65,66,67};
		String str2 = new String(ascChars);
		
		System.out.println("ASCI character is "+str2);

	}

}

