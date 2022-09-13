package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstraphadling {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://zoom.us/signup");
			
			WebElement month = driver.findElement(By.xpath("//span[@id=\"select-0\"]"));
			
			month.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"select-item-select-0-4\"]")).click();
			

}
}