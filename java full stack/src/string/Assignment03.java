package string;

import java.util.Scanner;

public class Assignment03 {


	
	
	    static char maxoccurance(String str)
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int count[] = new int [n];
	        
	        int len = str.length();
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	      
	        int max = -1;  // 
	        char result = ' ';   // 
	     
	        for (int i = 0; i < len; i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	      
	        return result;
	    }
	     
	   
	    public static void main(String[] args)
	    {
	        String str = "welcome to welcome";
	        System.out.println("Max occurring character is " +
	                            maxoccurance(str));
	    }
	
	}


