package testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Failedtestcaseexecution {
	@Test
	public void login()
	{
		System.out.println("Login to application");
		
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
		Assert.assertEquals(false, true);
	}
	@Test(dependsOnMethods="dashBoard")
	public void profile()
	{
		System.out.println("profile to application");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout from app");
	}
}
