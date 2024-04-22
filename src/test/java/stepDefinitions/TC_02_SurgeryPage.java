package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import pageObjects.surgeries;
import utilities.ExcelUtility;

public class TC_02_SurgeryPage {
	WebDriver driver;
	surgeries s;

	List<String> surgeryList=new ArrayList<String>();
	@Given("user clicks the surgery in the home page")
	public void user_clicks_the_surgery_in_the_home_page() throws InterruptedException, IOException {
		BaseClass.getLogger().info("****Inspecting the surgery page****");
		s = new surgeries(BaseClass.getDriver());
		s.surgeryPage();
		s.scrolling();
		List<String> surgery = s.surgeriess();
		for(String a : surgery) {
			System.out.println(a);
			surgeryList.add(a);
		}
		System.out.println();
		ExcelUtility.output2(surgeryList);
		ExcelUtility.closeExcel();
	}
}
