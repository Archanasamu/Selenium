$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/EditLead.feature");
formatter.feature({
  "name": "Edit Lead Functionality in LeafsTap Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the edit lead functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the user name as demosalesmanager",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enter_the_user_name_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enter_the_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "crmsfa page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.crmsfaPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.crmsfabutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "crm homepage should display",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Leads tab",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLeadsTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Leads home page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.leadsHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on find lead",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnFindLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find lead page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.findLeadPageShouldDisplay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lead id",
  "keyword": "Given "
});
formatter.match({
  "location": "EditLead.enterTheLeadId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Find leads button",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnFindLeadsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the lead from the result",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.selectTheLeadFromTheResult()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Edit button",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnEditButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit lead page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.editLeadPageShouldDisplay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Parent Account lookup",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheParentAccountLookup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find account should display",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.findAccountShouldDisplay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Acccount number and click on Find Account",
  "keyword": "Given "
});
formatter.match({
  "location": "EditLead.enterTheAcccountNumberAndClickOnFindAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the account number",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.selectTheAccountNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit Lead should display with account number selected",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.editLeadShouldDisplayWithAccountNumberSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the update button",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickOnTheUpdateButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lead should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.leadShouldBeUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});