package Junittestcases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit.Sub;

public class testcasesub {

	@Test
	public void test() 
	{
		Sub Obj1 = new Sub();
		int result = Obj1.substraction(10,5);
		 Assert.assertEquals(5, result);
	}

}
