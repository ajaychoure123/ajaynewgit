package listener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends com.utility.BaseClass{

	// WAP of screenshot and call that method in to another class
	
	public  static void captureScreenshot() throws IOException {
		
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		
		//String folderpath = System.getProperty("user.dir")+"\\screenshots\\"+".png";
		
		// to print a time in screenshot

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_hh_mm_ss"));		

		String path="C:\\Users\\lenovo\\selenium\\capturescreenshot\\Screenshotorangehrm"+time+".png";

		
		File destination=new File(path);
		
		FileHandler.copy(source, destination);
		
	}
	
	public static void main(String[] args) throws IOException {
	
		getBrowserInstance("Chrome");
		
		driver.navigate().to("https://zoom.us/signup");
		
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\Users\\lenovo\\selenium\\capturescreenshot\\zoomscreenshot.png";
		
		File destination=new File(path);
		
		FileHandler.copy(source, destination);

	}

}
