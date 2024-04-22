package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.filters;
import pageObjects.searchPage;
import pageObjects.top5Doctors;
import utilities.ExcelUtility;

public class TC_01_Top5Doctors {
	WebDriver driver;
	searchPage sp;
	filters f;
	top5Doctors doc;
	
	List<String> doctorsList = new ArrayList<String>();
	

	@Given("user enters city as {string} and user enters speciality as {string}")
	public void user_enters_city_as_and_user_enters_speciality_as(String cities, String speciality) throws InterruptedException, IOException {
		
		BaseClass.getLogger().info("Navigating to the home page");
		sp = new searchPage(BaseClass.getDriver());
		
		BaseClass.getLogger().info("****Entering the city****");
		sp.city(BaseClass.getProperties().getProperty("city"));
		
		BaseClass.getLogger().info("****Selecting from the city dropdown****");
		sp.cityDropDown();
		
		BaseClass.getLogger().info("****Entering the speciality****");
		Thread.sleep(5000);
		sp.speciality(BaseClass.getProperties().getProperty("speciality"));
		
		BaseClass.getLogger().info("****Selecting from the speciality dropdown****");
		sp.specialityDropDown();
	}

	@When("user applies the filter")
	public void user_applies_the_filter() throws InterruptedException {
		
		BaseClass.getLogger().info("user applying the filters");
		f=new filters(BaseClass.getDriver());
		
		BaseClass.getLogger().info("****Selecting review filter****");
		f.reviewFilter();
		f.review();
		
		BaseClass.getLogger().info("****Selecting experience filter****");
		f.experienceFilter();
		f.experience();
		
		BaseClass.getLogger().info("****Selecting price filter****");
		f.priceFilter();
		f.price();
		
		BaseClass.getLogger().info("****Selecting availability filter****");
		f.availabilityFilter();
		f.availability();
		
		BaseClass.getLogger().info("****Selecting sort by filter****");
		f.sortByFilter();
		f.sortBy();
	}

	@Then("the user should able to get the doctors list")
	public void the_user_should_able_to_get_the_doctors_list() throws InterruptedException, IOException {
		
		BaseClass.getLogger().info("Fetching the details of the doctors");
		doc = new top5Doctors(BaseClass.getDriver());
		List<WebElement>doctor=doc.doctors();
		
		for(int i=1; i<6; i++) { 
			
			BaseClass.getLogger().info("Doctor: "+i);
			doctor.get(i-1).click();
			
			Set<String>child = BaseClass.getDriver().getWindowHandles();
			List<String> child_handle = new ArrayList<String>(child);
			
			BaseClass.getDriver().switchTo().window(child_handle.get(1));
			Thread.sleep(3000);
			String doctors_details = doc.details();
			System.out.println(doctors_details+"\n");
			
			doctorsList.add(doctors_details);
			
			BaseClass.getDriver().close();
			BaseClass.getDriver().switchTo().window(child_handle.get(0));
		}
		
		ExcelUtility.output1(doctorsList);
	}
	
}
