package leaftapsAutomationJavaApp.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadJava {

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
		driver.findElementByXPath("//input[@name='id']").sendKeys("1");
		driver.findElementByXPath("//button[text()='Buscar Prospectos']").click();
		//driver.findElementByLinkText("13366").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicar Prospecto").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Gomathy1");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("QA");
		driver.findElementByXPath("//input[@value='Crear Prospecto']").click();
		
	
	}
}
