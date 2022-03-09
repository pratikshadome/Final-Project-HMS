package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import juint01.DIV;
import junit.framework.Assert;

public class testcase03 {

	@Test
	public void test() 
	
	{
         DIV obj3 = new DIV();
         int result = obj3.division(10,5 );
         
         Assert.assertEquals(2, result);
	}

}
