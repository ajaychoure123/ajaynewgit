package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cybersuccessautomation.BaseClass;

public class TimeScreenshot extends BaseClass{
	public  static void captureScreenshot() throws IOException {
		
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 
		File source = screenshot.getScreenshotAs(OutputType.FILE);
	}
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_hh_mm_ss"));	
        
		String path="C:\\Users\\lenovo\\selenium\\capturescreenshot\\"+time+".png";
		
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 
			File source = screenshot.getScreenshotAs(OutputType.FILE);



	}

}
