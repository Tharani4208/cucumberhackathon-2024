package stepDefinitions;

import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.forCorporate;

public class TC_05_ForCorporate {
	WebDriver driver;
	forCorporate fc = new forCorporate(BaseClass.getDriver());
	@Given("user clicks on the for corporate in the home page")
	public void user_clicks_on_the_for_corporate_in_the_home_page() throws InterruptedException {
		BaseClass.getLogger().info("****Inspecting the health and wellness form under for corporate section****");
		fc.forCoroprate();
	}

	@When("user clicks the health and corporate plans")
	public void user_clicks_the_health_and_corporate_plans() throws InterruptedException {
		fc.plans();
	}

	@And("user fills the form")
	public void user_fills_the_form() {
		BaseClass.getLogger().info("****Entering the name****");
		fc.name(BaseClass.randomString());
		BaseClass.getLogger().info("****Entering the organization name****");
		fc.organizationName(BaseClass.randomString());
		BaseClass.getLogger().info("****Entering the number****");
		fc.contactNumber(BaseClass.randomNumber());
		BaseClass.getLogger().info("****Entering the official E-Mail****");
		fc.officialEmailId(BaseClass.randomString()+"@gmail.com");
		BaseClass.getLogger().info("****Selecting the organization size****");
		fc.organizationSize("1001-5000");
		BaseClass.getLogger().info("****Selecting the Interested in section****");
		fc.interestedIn("Referring someone");
	}

	@And("user clicks on schedule a demo button")
	public void user_clicks_on_schedule_a_demo_button() {
		BaseClass.getLogger().info("****Submit button****");
		fc.submit_button();
	}
	@Then("the user validates whether the ThankYou message is displayed or not")
	public void the_user_validates_whether_the_thank_you_message_is_displayed_or_not() throws InterruptedException {
		BaseClass.getLogger().info("****Validating the 'THANK YOU' message****");
		System.out.println(fc.verification());
	}
}
