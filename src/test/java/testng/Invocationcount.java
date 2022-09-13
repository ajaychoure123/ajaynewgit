package testng;

import org.testng.annotations.Test;

public class Invocationcount {
	
	// To execute a particular test case multiple times then we have to use invocation count keyword.
	
	@Test(invocationCount = 5, priority = -1)
		public void home()
		{
			System.out.println("home Test case");
		}

		
		@Test
		public void logout()
		{
			System.out.println("logout Test case");
		}

		
		@Test(priority = 56)
		public void dashBoard()
		{
			System.out.println("DashBoard Test case");
		}


}
