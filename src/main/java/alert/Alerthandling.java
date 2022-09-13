package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/popups");
		
		/*
		 * WebElement alertpopup =
		 * driver.findElement(By.xpath("//input[@name=\"alert\"]"));
		 * 
		 * alertpopup.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String textmsg = driver.switchTo().alert().getText();
		 * 
		 * System.out.println("text on alert popup is:"+textmsg);
		 * 
		 * // we have to handle popup we call alert method
		 * 
		 * driver.switchTo().alert().accept();
		 */
		
		// to handle confirmation button
		
		WebElement confirmation = driver.findElement(By.xpath("//input[@name=\"confirmation\"]"));
		
		confirmation.click();
		
		Thread.sleep(2000);
		
		String confirmationdiss = driver.switchTo().alert().getText();
		
		System.out.println("text on alert pop is:"+confirmationdiss);
		
		driver.switchTo().alert().accept();
	}

}
