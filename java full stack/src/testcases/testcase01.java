package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import juint01.ADD;
import junit.framework.Assert;

public class testcase01 {

	@Test
	public void test()
	{
			ADD obj1 = new ADD();
			int result = obj1.addition01(6,5);
			
			Assert.assertEquals(11, result);
	}

}
