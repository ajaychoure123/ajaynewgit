package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodsupport {
	
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			
			Thread.sleep(3000);
			
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		
		username.sendKeys("abc.abc.@com");
		
		 String actual = username.getAttribute("value");
		 
		 System.out.println(actual);
		 
		 if(actual.equals("abc.abc.@com")) {
			 
			 System.out.println("value got verified");
		 }
		 else
		 {
		System.out.println("not verified");
		
	}

}
}