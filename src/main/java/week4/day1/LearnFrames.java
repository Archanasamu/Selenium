package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
	

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		
		
		/* To enter into the frame we have 3 types
		 * 1. using index - driver.switchTo().frame(Index)
		 * 2. using id value, name value -  driver.switchTo().frame(id_vaule or name_value)
		 * 3. using xpath - driver.switchTo().frame(webelement) 
		 */		
		// To enter into the frame 
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame); 
		
		//driver.switchTo().frame(0);
		driver.findElementByXPath("//li[text()='Item 4']").click();
		// come out of the frame and return to HTML content
		driver.switchTo().defaultContent();
		
		// driver.switchTo().parentFrame(); // one level back - not preferable 
		
		driver.findElementByLinkText("Download").click();
	}

}
