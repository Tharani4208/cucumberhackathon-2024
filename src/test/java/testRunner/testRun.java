package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features= {".//Feature/"},
				//features= {".//Feature//F1_top5Doctors.feature",".//Feature//F2_surgeryPage.feature",
				//		".//Feature//F3_forCorporate.feature"},
				glue="stepDefinitions",
				plugin= {"pretty", "html:reports/myreport.html", 
						  "rerun:target/rerun.txt",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				tags="@sanity",
				dryRun = false,
				monochrome=true,
				publish=true
				//tags="@regression"
				//tags="@sanity and @regression" 
				//tags="@sanity and not @regression"
				//tags="@sanity or @regression"
				)
public class testRun {

}
