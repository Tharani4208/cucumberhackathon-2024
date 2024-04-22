package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.forCorporate;

public class TC_03_forCorporate_invalidNumber {
	WebDriver driver;
	forCorporate fc = new forCorporate(BaseClass.getDriver());

	@Given("user clicks on the for corporate in the home pagee for invalid number")
	public void user_clicks_on_the_for_corporate_in_the_home_pagee_for_invalid_number() throws InterruptedException {
		BaseClass.getLogger().info("****Inspecting the health and wellness form under for corporate section****");
		fc.forCoroprate();
	}

	@When("user clicks the health and corporate plans with invalid number")
	public void user_clicks_the_health_and_corporate_plans() throws InterruptedException {
		fc.plans();
	}

	@And("user fills the form with invalid number")
	public void user_fills_the_form_with_invalid_number() {
		BaseClass.getLogger().info("****Entering the name****");
		fc.name(BaseClass.randomString());
		BaseClass.getLogger().info("****Entering the organization name****");
		fc.organizationName(BaseClass.randomString());
		BaseClass.getLogger().info("****Entering the number****");
		fc.contactNumber(BaseClass.randomString());
		BaseClass.getLogger().info("****Entering the official E-Mail****");
		fc.officialEmailId(BaseClass.randomString()+"@gmail.com");
		BaseClass.getLogger().info("****Selecting the organization size****");
		fc.organizationSize("1001-5000");
		BaseClass.getLogger().info("****Selecting the Interested in section****");
		fc.interestedIn("Referring someone");
	}
	
	@But("the button is disabled when invalid number is given")
	public void the_button_is_disabled() {
		Assert.assertEquals(fc.disabled(), false);
	}
}
