package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageadvance {
	WebDriver driver;
	@FindBy(xpath ="//*[@id='userid']")
	private WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath ="//*[@id='pin']")
	private WebElement pintextfield;
	
	

	@FindBy(xpath ="//*[@type='button']")
	WebElement button;
	

	public Loginpageadvance(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void enterCredentials() {
		
		username.sendKeys("DAA677");
		password.sendKeys("Velocity@123");

	}

	public void clickOnLogin() {
		loginbutton.click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pintextfield.sendKeys("866918");
		loginbutton.click();
	}

	public String getTitleOfPage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		button.isDisplayed();
		
		String titleofpage = driver.getTitle();

		return titleofpage;

	}

}
