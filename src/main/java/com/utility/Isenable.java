package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");

			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");   
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
			
			// to check webelement is enable
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"ohrmList_chkSelectRecord_18\"]"));
			
			boolean checkboxseen = checkbox.isEnabled();
			
			System.out.println(checkboxseen);
			
			//to select webelement
			
			boolean checkboxsel = checkbox.isSelected();
			
			System.out.println(checkboxsel);
	}

}
