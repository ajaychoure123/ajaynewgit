package utility;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;

import com.cybersuccessautomation.BaseClass;

public class Screenshotorangehrm extends BaseClass {

	public static void main(String[] args) throws IOException {

		getBrowserInstance("Chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		Screenshot.captureScreenshot();
		
           //String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_hh_mm_ss"));		
		
	}
	
}
