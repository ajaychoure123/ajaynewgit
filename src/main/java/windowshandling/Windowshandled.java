package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandled {

	public static void main(String[] args) {

  //System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();// chrome browser will get open

			driver.manage().window().maximize();// to maximize the window

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			String parentid = driver.getWindowHandle();
			
			System.out.println("Parent id is :"+parentid);
			
			WebElement link = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
			
			link.click();
			
			Set<String> allwinid = driver.getWindowHandles();
			
			
			
			for(String id:allwinid)
			{
				System.out.println(id);
			}
			
			
			
			
		}
	}


