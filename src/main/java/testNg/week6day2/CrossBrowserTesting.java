package testNg.week6day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	RemoteWebDriver driver;
	
	@Parameters({"browser","username","password"})	
    @Test
	public void createLead(String browserValue,String uName,String pword) {
	
	if(browserValue.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	} else if(browserValue.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	} else
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys(uName);
	driver.findElementById("password").sendKeys(pword);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		// Create lead
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sudharson");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
