package Junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Mul;
import junit.framework.Assert;

public class testcasemul {

	@Test
	public void test() 
	{
		Mul obj1 = new Mul();
		int result = obj1.multiplication(5, 5);
		
		Assert.assertEquals(25, result);
	}

}
