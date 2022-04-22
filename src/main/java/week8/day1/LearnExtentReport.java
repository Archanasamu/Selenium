package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
	//Step1: Report Level Setup
		// To create Physical path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentsReport/result.html");
		
		// To maintain the run history
		reporter.setAppendExisting(true);
		
		// To generate the report - Actual report with values
		ExtentReports extent = new ExtentReports();
		
		// To attach the result to the physical path
		extent.attachReporter(reporter);
		
	// Step2: Set up the Test case details
		ExtentTest testcase = extent.createTest("LoginAndLogout", "Login Test Case");
		testcase.assignAuthor("Archana");
		testcase.assignCategory("Smoke");
		
	// Step3: Set up test level status
		testcase.pass("Enter the username");
		testcase.pass("Enter the password");
		testcase.fail("Click Login",MediaEntityBuilder.createScreenCaptureFromPath(".././Data/SampleSH.png").build());
		
// At the end of report mandatory 
		extent.flush();
	}

}
