package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB); // Keys - enum class
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//driver.findElementByTagName("tr"); // tr - Table row
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		
		List<String> trainsName = new ArrayList<String>();
	
		
		for (WebElement eachRow : allRows) {
			List<WebElement> allColumn = eachRow.findElements(By.tagName("td")); // td- table data/table column
			//System.out.println(allColumn.get(1).getText());
			trainsName.add(allColumn.get(0).getText());
		}
		
		Collections.sort(trainsName);
		System.out.println(trainsName);
	}

}
