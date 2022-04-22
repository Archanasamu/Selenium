Feature: Edit Lead Functionality in LeafsTap Application

@regression @functional
Scenario: Test the edit lead functionality

And Enter the user name as demosalesmanager
And Enter the password as crmsfa 
When click on login button
Then crmsfa page should display
When click on crmsfa button
Then crm homepage should display
When click on Leads tab
Then Leads home page should display
When Click on find lead 
Then Find lead page should display
Given enter the lead id 
When click on Find leads button
Then Select the lead from the result
When Click on Edit button 
Then Edit lead page should display
When Click on the Parent Account lookup
Then Find account should display
Given Enter the Acccount number and click on Find Account
When Select the account number 
Then Edit Lead should display with account number selected
And Click on the update button
Then Lead should be updated  