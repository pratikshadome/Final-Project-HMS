package Junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase11 {

	@Test
	public void test() {
		String s1 = null;
		String s2 = "welcome";

		assertNotNull(s2);

	}

	@Test

	public void test01() {
		String s1 = null;
		String s2 = "java";

		assertNull(s1);
	}

	@Test
	public void test02() {
		String s1 = "edubridge";
		String s2 = "india";

		//assertSame(s1, s2);   
		assertNotSame(s1,s2);
	}

	@Test
	public void test03() {
		int arr01[] = { 1, 2, 3, 4, 5 };
		int arr02[] = { 1, 2, 3, 4, 5 };

		assertArrayEquals(arr01, arr02);
	}

	@Test
	public void test04() 
	{
		int a = 5;
		int b =5;
		int c = a+b;
		
		assertTrue(c==10);
		assertFalse(c==11);
		}
	
	
	
}
