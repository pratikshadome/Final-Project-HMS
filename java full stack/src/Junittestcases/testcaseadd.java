package Junittestcases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit.Add;

public class testcaseadd {

	

	@Test
	public void test() 
	{
		Add obj1 = new Add();
		int result = obj1.addition(5,5);
		
		Assert.assertEquals(10, result);
		
	}

}
