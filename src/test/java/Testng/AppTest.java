package Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void testTrue(){
		Assert.assertEquals(true, true);
	}
  @Test
  public void testFalse(){
	  Assert.assertEquals(true, true);
  }
}
