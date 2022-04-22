package leaftapsAutomationJavaApp.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadJava {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		// Create lead
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kavipriya");
		//dropdown
		WebElement sourceID = driver.findElementById("createLeadForm_dataSourceId");
		Select sobj = new Select(sourceID);
		sobj.selectByVisibleText("Existing Customer");
		driver.findElementByName("firstNameLocal").sendKeys("Priya");
		driver.findElementByName("personalTitle").sendKeys("Hello");
		driver.findElementByName("generalProfTitle").sendKeys("Testing");
		driver.findElementByName("annualRevenue").sendKeys("20000");
		//dropdown
		WebElement enumID = driver.findElementByName("industryEnumId");
		Select enumobj = new Select(enumID);
		enumobj.selectByValue("IND_SOFTWARE");
		//dropdown
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("S-Corporation");
		driver.findElementByName("sicCode").sendKeys("a256");
		driver.findElementById("createLeadForm_description").sendKeys("Descriptpion");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementByName("numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("1234");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("0987654321");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sudharson@hcl.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Archana");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("abcdefgh");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600023");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Miami");
		WebElement spGID = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select spGIDobj = new Select(spGID);
		spGIDobj.selectByValue("FL");
		WebElement countryGID = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryGIDobj = new Select(countryGID);
		countryGIDobj.selectByValue("USA");
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
