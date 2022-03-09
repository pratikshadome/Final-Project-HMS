package string;

import java.util.StringTokenizer;

public class Tokenizer01 {

	public static void main(String[] args) 
	{
		StringTokenizer s1 = new StringTokenizer("loyalty is the best policy");
		while(s1.hasMoreTokens())
		{
			System.out.println(s1.nextToken());
		}
	}

}
