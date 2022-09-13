package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void verifyUrl()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

			
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://www.facebook.com/");
		
		 String url = driver.getCurrentUrl();
		 
		 String expectedurl = "facebooke";
		 
		boolean ispresent = url.contains(expectedurl);
		
		SoftAssert sa = new SoftAssert();
				
		sa.assertTrue(ispresent, "Test case is failed please file a bug");
		
		System.out.println("After assertion statement 1");
		
		
		System.out.println("After assertion statement 2");
		
		sa.assertAll();// at this level we mark the status of test case.
	
	}




}
