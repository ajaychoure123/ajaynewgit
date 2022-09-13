package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	@FindBy(xpath ="//*[@type='button']")
	private WebElement getstartedbutton;
	
	@FindBy(xpath ="//div[@class='instrument-search']//*[@type='text']")
	private WebElement searchbox;
	
	@FindBy(xpath ="//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	private WebElement buybutton;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement outerbuybutton;
	
	

	@FindBy(xpath ="//*[@class='message']")
	WebElement textmessage;
	

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void clickOnGetStarted() {
		
		getstartedbutton.click();
		
	}

	public void searchShares() {
		searchbox.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

	public void buyShares() {
		buybutton.click();
		outerbuybutton.click();
		String message = textmessage.getText();	
		
	}


}
