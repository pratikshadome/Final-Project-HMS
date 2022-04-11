package string;

public class Practice7 
{

	public static void main(String[] args) 
	{
                String s = " j a va  s    t    a      r  ";
                
                //String result=s.trim();
                //System.out.println(result);
                
                String output = s.replaceAll("\\s", "");////using unicode of space
                System.out.println(output);
	}

}
