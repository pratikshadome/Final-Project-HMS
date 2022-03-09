
/*Create an ArrayList which will be able to store only Strings.
Create a printAll method which will print all the elements
using an Iterator.*/

package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Assingment02

	{

		public static void main(String[] args)
		{
			List<String> list = new ArrayList<>();
			list.add("pratiksha");
			list.add("RAHEL");
			list.add("arti");
			list.add("priya");
			
			printAll(list);
		}mplo

		public static void printAll(List<String> list)
		{
			Iterator<String> itr = list.iterator();
			
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

	}



		

	