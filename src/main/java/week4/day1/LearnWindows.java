package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
	

	public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); // to get the Title of the current window
		System.out.println(driver.getCurrentUrl()); // to get the URL of the current window 
		
		String currentWindow = driver.getWindowHandle(); // to get the single window details
		System.out.println(currentWindow);
		
		//driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementById("home").click(); 
		
		// get all window info - only get the current session windows 
		Set<String> allWindow = driver.getWindowHandles();
		List<String> listOfWindow = new ArrayList<String>(allWindow); 
		//listOfWindow.addAll(allWindow); 
		// to get the child window info
		String childWindow = listOfWindow.get(1);
		// switch to child window
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		// need to switch to Main window 
		
		//driver.switchTo().window(currentWindow);
		driver.switchTo().window(listOfWindow.get(0));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		//driver.close(); // to close the single window
		//driver.quit(); // to close all the window in the current execution 
		
		// To take screenshot
		
		File scr = driver.getScreenshotAs(OutputType.FILE); // Press Prtsc
		File snap = new File("output.png"); // create new file output.png -file path need to give the directory 
		FileUtils.copyFile(scr, snap); // paste the image to destination file
		
	//File screenshotAs = driver.findElementById("home").getScreenshotAs(OutputType.FILE); - To get the SS of find element alone
	}
	

}
