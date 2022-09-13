package listener;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteLogin {
	static WebDriver driver;
	@Test(priority = 1)
	public void navToApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://kite.zerodha.com/");

}
      @Test(priority = 2)
      public void logintoapp() {
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  
    		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
    		
    		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
    		
    		driver.findElement(By.xpath("//*[@type='submit']")).click();
    		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
    		driver.findElement(By.xpath("//*[@type='submit']")).click();
    		
    		driver.findElement(By.xpath("//*[@type='button']"));
    		
    		String url = driver.getCurrentUrl();
    		
    		String expected="dashboard";
    		
    		boolean ispresent = url.contains(expected);
    		
    		System.out.println(ispresent);
    		
    		Assert.assertEquals(ispresent, false);
      }   			
      }