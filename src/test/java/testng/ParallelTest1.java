package testng;

import org.testng.annotations.Test;

public class ParallelTest1 {
	@Test
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
}
