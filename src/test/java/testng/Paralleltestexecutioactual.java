package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltestexecutioactual {
 WebDriver driver;
 @Parameters("url")
 @Test(priority=1)
 
	public void Navitoapp(String pageurl) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(pageurl);
	
	}
 
 @Test(priority=2)
    public void  logintoapp() {
	 
	 String title = driver.getTitle();
	 
	 System.out.println(title);
 }
}
