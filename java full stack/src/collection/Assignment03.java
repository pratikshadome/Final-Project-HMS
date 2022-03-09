
/*Create an ArrayList which will be able to store only numbers
like int,float,double,etc, but not any other data type.*/


package collection;

import java.util.ArrayList;
import java.util.List;


	class MyArrayList<E> extends ArrayList<E> 
	{
		@Override
		public boolean add(E e)
		{
			if (e instanceof Integer || e instanceof Float || e instanceof Double)
			{
				super.add(e);
				return true;
			} else {
				throw new ClassCastException("Only Integer, Float, and Double are supported.");
			}
		}
	}

	public class Assignment03 
	
	{

		public static void main(String[] args)
		{
			List<Object> list = new MyArrayList<>();
			
			try 
			{
				list.add(15);
				list.add(1.2F);
				list.add(3.1415D);
				//list.add("Rahel");
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println(list);

		}
	}

	

	
