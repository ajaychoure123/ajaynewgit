package com.utility;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver=null;	
	public static double value;

	public static void getBrowserInstance(String browser) {

		switch (browser) {

		// case to launch chrome browser

		case "Chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			
			

			break;

		// case to launch edge browser

		case "Edge":

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();

			break;

		// if not case match then default will launch chrome browser

		case "default":

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();

		}
	}

	public static void validate(String actual, String expected) throws Exception {

		if (actual.equals(expected)) {

			System.out.println("successfully validate " + actual + "in the screen");

		} else {

			throw new Exception("failed to validate the" + actual + "with" + expected);

		}
	}                                             
	/*
	 * public static String generateRandomString(int count) {
	 * 
	 * Random random=new Random();
	 * 
	 * return random.ints(65,90)
	 * 
	 * .limit(count)
	 * 
	 * .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::
	 * append)
	 * 
	 * .toString();
	 * 
	 * }
	 */

 
    public static void fluentWait(By by) {
    	
    	Wait wait =new FluentWait<WebDriver>(driver) 
    			.withTimeout(Duration.ofSeconds(10))
    			.pollingEvery(Duration.ofSeconds(2))
    			.ignoring(Exception.class);
    			
    	wait.until(new Function<WebDriver,WebElement>() {
    		
    	public WebElement apply (WebDriver driver) {
    		
    		System.out.println("Applying fluent wait..");
    		
    		return driver.findElement(null);
    	}
    		
    	
    });
    	
    }
 public static ChromeOptions setChromeOptions() {
	 
	 ChromeOptions option=new ChromeOptions();
	 option.addArguments("headless");
	 option.setHeadless(false);
	 option.setImplicitWaitTimeout(Duration.ofSeconds(10));
	 option.addArguments("incognito");
	 option.setAcceptInsecureCerts(true);
	 
	 Map<String,Object> map=new HashMap<>();
	 map.put("download.default_directory","C://");
	 map.put("profile.password_manager_enabled",true);
	 option.setExperimentalOption("prefs", map);
	 return option;
	 }
}


    
