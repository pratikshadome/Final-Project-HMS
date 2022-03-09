package Junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert {

	@Test
	public void test()
	{
		int array[]= {1,2,3,4};
		int array2[]= {1,2,3,4};
		
		assertArrayEquals(array,array2);
	}

}
