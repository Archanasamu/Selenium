package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass {
	
	@Then("crmsfa page should display")
	public void crmsfaPage() {
		System.out.println("crmsfa page should display");
		
	}
	
	@When("click on crmsfa button")
	public void crmsfabutton() {
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@Then("crm homepage should display")
	public void homePage() {
		System.out.println("Home page should display");
		
	}
	
	@When("click on Leads tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
		
	}
	
	@Then("Leads home page should display")
	public void leadsHomePage() {
		System.out.println("Leads home page should display");
	}

	@Given("click on create lead")	
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();		
	}
 
	@Then("create lead page should display")
	public void createLeadPage() {
		System.out.println("Create Lead page");	
	}
	
	@Given("Enter the company name as (.*)")
	public void companyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the First name as (.*)")
	public void firstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			}
	@And("Enter the Last name as (.*)")
	public void lastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click on the Create Lead button")
	public void clickOnCreateButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Lead should be created")
	public void leadCreated() {
		System.out.println("Lead Created");
	}
	
	}
	

