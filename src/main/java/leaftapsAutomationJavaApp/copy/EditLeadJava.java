package leaftapsAutomationJavaApp.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadJava {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		//Find Leads
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("13365");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByLinkText("13365").click();
		driver.findElementByLinkText("Edit").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>(allWindows); 
		String childWindow = listOfWindows.get(1);
		driver.switchTo().window(childWindow); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//input[@name='id']").sendKeys("13377");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("13377").click();
		driver.switchTo().window(listOfWindows.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//input[@value='Update']").click();
	}
}
