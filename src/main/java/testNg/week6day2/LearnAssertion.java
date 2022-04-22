package testNg.week6day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnAssertion {
	
	@Test
	public void testCase1() {
		
		String expectedTitle = "TestLeaf";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		
		/*
		 * if(expectedTitle.equals(actualTitle)) {
		 * System.out.println("Title is Matching"); } else {
		 * System.out.println("Title Not Matching"); }
		 */
		//Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.assertEquals(expectedTitle, actualTitle); //HardAssert
		//Assert.assertTrue(expectedTitle.equals(actualTitle));
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedTitle, actualTitle);
		
		
		
	driver.close();
	
	softAssert.assertAll();
	}
	
	

}
