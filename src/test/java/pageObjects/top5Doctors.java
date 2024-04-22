package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class top5Doctors extends basePage{

	public top5Doctors(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@class='listing-doctor-card']//*[@class='info-section']/a")
	List<WebElement> doctors;
	
	public List<WebElement> top5Doctors = new ArrayList<WebElement>();
	public List<WebElement> doctors(){
		for(int i=1; i<6; i++) { 
			top5Doctors.add(doctors.get(i));
		}
		return top5Doctors;
	}
	
	@FindBy(xpath="//*[@class='pure-u-20-24']")
	WebElement doctorDetails;
	public String details() {	
		return doctorDetails.getText();
	}

}
