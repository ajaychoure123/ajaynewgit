package testng;

import org.testng.annotations.Test;

public class SinglePriority {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test(priority = 2)
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
	@Test(priority = 4)
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	@Test(priority = 3)
	public void home()
	{
		System.out.println("home Test case");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout Test case");
	}

}
