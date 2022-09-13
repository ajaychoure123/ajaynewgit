package testng;

import org.testng.annotations.Test;

public class Dependsonmethod2 {
	@Test(dependsOnMethods = "testng.Dependsonmethod", priority = 4)
	public void profile()
	{
		System.out.println("Profile Test case");
	}

	
	@Test(priority = 5)
	public void dashBoard()
	{
		System.out.println("dashboard Test case");
	}


}
