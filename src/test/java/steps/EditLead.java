package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends BaseClass {
	
	@When("Click on find lead")
	public void clickOnFindLead() {
		driver.findElementByLinkText("Find Leads").click();
	   
	}

	@Then("Find lead page should display")
	public void findLeadPageShouldDisplay() {
	   System.out.println("Find Lead page displayed");
	}

	@Given("enter the lead id")
	public void enterTheLeadId() {
		driver.findElementByXPath("//input[@name='id']").sendKeys("13365");
	   
	}

	@When("click on Find leads button")
	public void clickOnFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
	    
	}

	@Then("Select the lead from the result")
	public void selectTheLeadFromTheResult() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	    
	}

	@When("Click on Edit button")
	public void clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
	   
	}

	@Then("Edit lead page should display")
	public void editLeadPageShouldDisplay() {
		System.out.println("Edit Lead page displayed");
	    
	}

	@When("Click on the Parent Account lookup")
	public void clickOnTheParentAccountLookup() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
	 
	}

	@Then("Find account should display")
	public void findAccountShouldDisplay() {
		System.out.println("Find Account should display");
	
	}

	@Given("Enter the Acccount number and click on Find Account")
	public void enterTheAcccountNumberAndClickOnFindAccount() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>(allWindows); 
		String childWindow = listOfWindows.get(1);
		driver.switchTo().window(childWindow); 
		driver.findElementByXPath("//input[@name='id']").sendKeys("13377");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(listOfWindows.get(0));    
	}

	@When("Select the account number")
	public void selectTheAccountNumber() {
		System.out.println("Account Number Selected");
		
	}

	@Then("Edit Lead should display with account number selected")
	public void editLeadShouldDisplayWithAccountNumberSelected() {
		System.out.println("Edit Lead should display with account number selected");
	
	}

	@Then("Click on the update button")
	public void clickOnTheUpdateButton() {
		driver.findElementByXPath("//input[@value='Update']").click();
	}

	@Then("Lead should be updated")
	public void leadShouldBeUpdated() {
		System.out.println("Lead edit updated");

	}
	

}
