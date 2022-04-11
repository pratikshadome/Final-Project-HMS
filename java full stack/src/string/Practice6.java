
//remove all special characters from string

package string;

public class Practice6 {

	public static void main(String[] args) 
	{
                  String s1 = "#j@a%v&a*s!t^ar**";
                  String result=s1.replaceAll("[^a-zA-Z0-9]","");
                  System.out.println(result);
	}

}
