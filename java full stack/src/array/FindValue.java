package array;

public class FindValue
{

	public static void main(String[] args)
	{
		int[] num = { 11, 22, 33, 44, 55 };
		int Value = 55;
		boolean found = false;

		for (int i : num) 
		{
			if (i == Value)
			{

				found = true;
				break;
			}
		}

		if (found)
		{
			System.out.println(Value + " is found.");
		}
		else
		{
			System.out.println(Value + " is not found.");
		}
	}
}

// TODO Auto-generated method stub
