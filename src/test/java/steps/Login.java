package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	
//	  @Given("Launch the Chrome browser") public void launch_the_Chrome_browser() {
//	  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
//	  
//	  @Given("Load the application URL(.*)") public void
//	  load_the_application_URL(String url) { driver.get(url);
//	  
//	  }
	 

	@Given("Enter the user name as (.*)")
	public void enter_the_user_name_as_demosalesmanager(String uName) {
		driver.findElementById("username").sendKeys(uName);
	   
	}

	@Given("Enter the password as (.*)")
	public void enter_the_password_as_crmsfa(String pWord) {
		driver.findElementById("password").sendKeys(pWord);
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		System.out.println("HomePage");
	   
	}
	
	@But ("Error message should display")
	public void errorMessageDisplay() {
		System.out.println("Error Message");
	
	}

}
