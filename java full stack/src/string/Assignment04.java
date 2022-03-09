
// Write a Java program to print the frequency of each character in a string


package string;

public class Assignment04 {
	
	public static void main(String[] args)
	{  
        String str = "welcome in edubridge family";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        
        char string[] = str.toCharArray();  //convert string into array
          
        for(i = 0; i <str.length(); i++)
        {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) 
            {  
                if(string[i] == string[j])
                {  
                    freq[i]++;  
                      
                   string[j] = '0';   //Set string[j] to 0 to avoid printing visited character  
                   
                }  
            }  
        }  
           
        System.out.println("Characters and their frequency frequencies");  
        for(i = 0; i <freq.length; i++)
        {  
            if(string[i] != ' ' && string[i] != '0')  
            	
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  
 


		
	}


