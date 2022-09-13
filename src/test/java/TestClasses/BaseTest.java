package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Dashboard;
import pages.Loginpageadvance;


public class BaseTest {
	static WebDriver driver;
	Loginpageadvance lp;
	Dashboard db;

	@BeforeSuite
	public void initBrowser()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://kite.zerodha.com/");

}
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}
	@BeforeClass
	public void objectCreation()
	{
		 lp = new Loginpageadvance(driver);
		 db = new Dashboard(driver);
	}

}