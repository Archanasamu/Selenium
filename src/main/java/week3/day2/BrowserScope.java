package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserScope {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // To get the exe of the chromedriver
		
		// ClassName obj = new ClassName(); - obj - object reference, ClassName(); - constructor, ClassName - Scope
		ChromeDriver driver = new ChromeDriver(); // creating chromedriver object
		// Load the URL to test

		WebDriver w_driver = new ChromeDriver(); // Webdriver - Interface - scope is very less
		
		RemoteWebDriver r_driver = new ChromeDriver(); // RemoteWebDriver - Parent Class extends Interface - Scope is less
		
		ChromeDriver c_driver = new ChromeDriver();  // ChromeDriver - Child extends Parent -  Scope is more 
		
		w_driver.get("http://leaftaps.com/opentaps/"); 
		
		r_driver.findElement(null);
		
		c_driver.getNetworkConnection(); 
		
	}
}