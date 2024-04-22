package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class filters extends basePage{

	public filters(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@class='c-filter__box u-pos-rel c-dropdown'][2]")
	WebElement reviewFilter;
	public void reviewFilter() throws InterruptedException {
		reviewFilter.click();
		//Thread.sleep(3000);
	}
	
	@FindBy(xpath="//*[@data-qa-id='doctor_review_count_list']//li[1]")
	WebElement  review;
	public void review() throws InterruptedException {
		review.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//*[@data-qa-id='years_of_experience_section']")
	WebElement experienceFilter;
	public void experienceFilter() throws InterruptedException {
		experienceFilter.click();
		//Thread.sleep(3000);
	}
	@FindBy(xpath="//*[@data-qa-id='years_of_experience_section']//li[1]")
	WebElement experience;
	public void experience() throws InterruptedException {
		experience.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//div[@class='u-d-inlineblock u-color--white u-c-pointer']")
	WebElement priceFilter;
	public void priceFilter() throws InterruptedException {
		priceFilter.click();
		//Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Fees1']//div[@data-qa-id='Fees_radio']")
	WebElement  price;
	public void price() throws InterruptedException {
		price.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//div[@class='u-d-inlineblock u-color--white u-c-pointer']")
	WebElement availabilityFilter;
	public void availabilityFilter() throws InterruptedException {
		availabilityFilter.click();
		//Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Availability2']//div[@class='c-filter__select--radio u-d-inlineblock u-valign--middle u-pos-rel']")
	WebElement availability;
	public void availability() throws InterruptedException {
		availability.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//span[@class='c-sort-dropdown__selected c-dropdown__selected']")
	WebElement sortByFilter;
	public void sortByFilter() throws InterruptedException {
		sortByFilter.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//li[@aria-label='Consultation Fee - Low to High']")
	WebElement sortBy;
	public void sortBy() throws InterruptedException {
		sortBy.click();
		Thread.sleep(3000);
	}
}