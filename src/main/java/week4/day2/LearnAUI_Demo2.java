package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI_Demo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		
		driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
		
		WebElement eleElectronics = driver.findElementByXPath("//div[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElectronics).perform();
		
		WebElement eleGaming = driver.findElementByLinkText("Gaming");
		builder.moveToElement(eleGaming).perform();
		
	    driver.findElementByLinkText("Gaming Mouse").click();
		
		
		

	}
}
