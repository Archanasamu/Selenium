package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		
		//driver.findElementByXPath("//button[text()='Alert Box']").click();
		//driver.findElementByXPath("//button[text()='Confirm Box']").click();
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10); //explicit wait
		Alert until = wait.until(ExpectedConditions.alertIsPresent()); // wait until Alert is present

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))); // wait until element is clicked
		
		String text = driver.switchTo().alert().getText(); 
		
		System.out.println(text);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss(); 
		driver.switchTo().alert().sendKeys("Archana");  
		
	}
}
