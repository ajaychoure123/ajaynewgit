package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public void entercridential() {
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("DAA677");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Velocity@123");
	}
     public void Clickonlogin() {
	
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
}
     public void enterpin() {
    	 
    	 driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("866918");
    	 
    	 driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();     }
}