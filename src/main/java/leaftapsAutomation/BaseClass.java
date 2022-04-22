package leaftapsAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//ChromeDriver driver;
	RemoteWebDriver driver;
	
	String excleFileName;
	
	// parameter can't be in order
	@Parameters({"username","password"})
	
	@BeforeMethod
	public void crmLogin(String uName, String Pword) { // Pre-condition should follow the order given in the parameterization
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(Pword);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
	}
	
	@AfterMethod 
	public void closeBrowser() { // Post-Condition
		
		driver.close();
		
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		
		LearnReadExcel red = new LearnReadExcel();
		String[][] data = red.readData(excleFileName);
		
		/*
		 * String [][] data = new String[3][5]; data[0][0] = "HCL"; data[0][1] =
		 * "Sudharson"; data[0][2] = "S"; data[0][3] = "Susan"; data[0][4] = "Hello";
		 * 
		 * data[1][0] = "TCS"; data[1][1] = "Manikandan"; data[1][2] = "V"; data[1][3] =
		 * "Mani"; data[1][4] = "Hi";
		 * 
		 * data[2][0] = "CTS"; data[2][1] = "Sathiya"; data[2][2] = "P"; data[2][3] =
		 * "Sathi"; data[2][4] = "Hello";
		 */
		
		return data;
	}

}
