package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class forCorporate extends basePage{

	public forCorporate(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@class='para cushion-right-large display-inline nav-items nav-items--additional-link hover-dark u-d-trigger dropdown-toggle']")
	WebElement forCoroprate;
	public void forCoroprate() throws InterruptedException {
		Thread.sleep(3000);
		forCoroprate.click();
	}
	
	@FindBy(linkText = "Health & Wellness Plans")
	WebElement plans;
	public void plans() throws InterruptedException {
		plans.click();
	}
	
	@FindBy(id="name")
	WebElement name;
	public void name(String a) {
		name.sendKeys(a);
	}
	
	@FindBy(id="organizationName")
	WebElement organizationName;
	public void organizationName(String a) {
		organizationName.sendKeys(a);
	}
	
	@FindBy(id="contactNumber")
	WebElement contactNumber;
	public void contactNumber(String a) {
		contactNumber.sendKeys(a);
	}
	
	@FindBy(id="officialEmailId")
	WebElement officialEmailId;
	public void officialEmailId(String a) {
		officialEmailId.sendKeys(a);
	}
	
	@FindBy(id="organizationSize")
	WebElement organizationSize;
	public void organizationSize(String value) {
		Select select = new Select(organizationSize);
		select.selectByValue(value);
	}
	
	@FindBy(id="interestedIn")
	WebElement interestedIn;
	public void interestedIn(String value) {
		Select select1 = new Select(interestedIn);
		select1.selectByValue(value);
	}
	
	@FindBy(xpath="//header[@id='header']//button[@type='submit'][normalize-space()='Schedule a demo']")
	WebElement submit_button;
	public void submit_button() {
		submit_button.click();
	}
	public boolean disabled() {
		return submit_button.isEnabled();
	}
	
	@FindBy(xpath="(//*[@class='u-text--bold text-alpha'])[1]")
	WebElement verification;
	public boolean verification() throws InterruptedException {
		Thread.sleep(10000);
		return verification.isDisplayed();
	}
}
