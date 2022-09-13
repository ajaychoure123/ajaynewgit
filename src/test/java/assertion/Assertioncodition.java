package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
                                                      // Hard  assert -not  allow to move further if test case fail
public class Assertioncodition {
	
		@Test
			public void verifyValues()
			{
				String actualvalue ="Velocity";
				
				String expectedvalue = "velocity";
				
				
		Assert.assertEquals(actualvalue, expectedvalue);// this will mark the test case as failed.
				
						System.out.println("After assertion statement");
			}
			
		//Note : In a test case if any of the assert gets fail then that test case will automatically marked as fail.

		@Test
			public void assertFalseCondition()
			{
				
				
				Assert.assertFalse(false, "Test case gets fail");
			}

}
