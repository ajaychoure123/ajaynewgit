package testng;

import org.testng.annotations.Test;

public class Includeandexclude {
	@Test
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	
	@Test
	public void login()
	{
		System.out.println("Login Test case");
	}
	
	@Test
	public void home()
	{
		System.out.println("Home test case");
	}

}
