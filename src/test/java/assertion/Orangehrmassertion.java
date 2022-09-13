package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orangehrmassertion {
	@Test
	public void verifyurl() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");   
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String url = driver.getCurrentUrl();
		
		String expected="dashboards";
		
		boolean ispresent = url.contains(expected);
		
		Assert.assertTrue(ispresent, "Test case is failed please file a bug");
}
}