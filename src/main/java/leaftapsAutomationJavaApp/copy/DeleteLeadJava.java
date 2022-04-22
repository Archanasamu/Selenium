package leaftapsAutomationJavaApp.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadJava {

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
		driver.findElementByLinkText("Prospectos").click();
		driver.findElementByLinkText("Buscar Prospectos").click();
		//Find Leads
		/*
		 * driver.findElementByXPath("//input[@name='id']").sendKeys("13404");
		 * driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * driver.findElementByLinkText("13404").click();
		 * driver.findElementByClassName("subMenuButtonDangerous").click();
		 * System.out.println("Lead Deleted");
		 */
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(leadID);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Eliminar").click();
		driver.findElementByLinkText("Buscar Prospectos").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Buscar Prospectos']").click();
		Thread.sleep(2000); 
		String text = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	
	}
}
