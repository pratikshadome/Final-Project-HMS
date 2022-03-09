package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import juint01.MUL;
import junit.Mul;
import junit.framework.Assert;

public class testcase02 {

	@Test
	public void test()
	{
		MUL obj2 = new MUL();
		int result = obj2.multiplication01(5, 5);
		
		Assert.assertEquals(25, result);
		
	}

}
