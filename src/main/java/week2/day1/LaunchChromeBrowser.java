package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		// Launch the browser first - Need to set the property first
		//need to set the systemproperty and driver path before launching the browser
        //Type1 - System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		
		//ChromeDriver driver = new ChromeDriver();
		
		//Type 2 - Add the dependency to pom.xml from - webdrivermanager and then need to set the webdriver manager property - no need to download driver files 
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		// Load the URL to test
		driver.get("http://leaftaps.com/opentaps/");
		
		//Implicit wait - one time common wait 
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		
		// To maximize the browser
		
		driver.manage().window().maximize();
		
		// To find the element
		
		WebElement eleUsername = driver.findElementById("username");
		
		// sendkeys will send the value to the webpage
		
		eleUsername.sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementById("logout").click(); 
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		
		//Type 1 => Simple drop down handling using sendkeys
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		
		//Type 2 => Select class in-built in selenium
		
		WebElement elementdropdown = driver.findElementById("createLeadForm_dataSourceId");
		
		Select obj = new Select(elementdropdown); 
		
		// 1. Select using visibletext
		
		// obj.selectByVisibleText("Conference");
		
		// 2. Select using index
		
		// obj.selectByIndex(4);
		
		// 3. Select using value
		
		obj.selectByValue("LEAD_PARTNER"); 
		
// xpath -> xml path basic xpath 
		
		// Type 1 Attribute based xpath - Syntax - //tagname[@attribute='value']
       // Type 1.1 Partial Attribute Syntax - //tagname[contains(@attribute,'value')]
	   // Type 2 Text based xpath - Syntax - //tagname[text()='value']
		//Type 2.1 Partial Text based - Syntax - //tagname[contains(text(),'value)]
// xpath -> collection based using Index - Syntax- (//tagname[@attribure='value'])[index]		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
