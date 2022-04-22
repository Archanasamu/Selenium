package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI_Demo1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame); 
		
		//driver.switchTo().frame(0);
		
		WebElement eleDraggable = driver.findElementById("draggable");
		WebElement eleDroppable = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver); 
		builder.dragAndDrop(eleDraggable, eleDroppable).perform();
		
	}

}
