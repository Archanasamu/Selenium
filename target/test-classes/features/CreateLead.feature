Feature: Create Lead functionality in LeafTaps application

@regression
Scenario: Create lead by filling only mandatory details

And Enter the user name as demosalesmanager
And Enter the password as crmsfa 
When click on login button
Then crmsfa page should display
When click on crmsfa button
Then crm homepage should display
When click on Leads tab
Then Leads home page should display
Given click on create lead
Then create lead page should display
Given Enter the company name as HCL
And Enter the First name as Gomathy
And Enter the Last name as S
When Click on the Create Lead button
Then Lead should be created