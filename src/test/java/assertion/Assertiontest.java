package assertion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiontest {

	@Test
	public void verifyurl() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		
		String expectedurl="facebooke";
		
		boolean ispresent = url.contains(expectedurl);
		
		Assert.assertTrue(ispresent, "Test case is failed please file a bug");
		
	}
}
