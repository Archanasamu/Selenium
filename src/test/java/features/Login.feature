Feature: Login functionality of LeafTaps Application
#Background:
#Given Launch the Chrome browser
#And Load the application URL http://leaftaps.com/opentaps/control/main

@functional
Scenario Outline: Test using valid credientials

And Enter the user name as <username>
And Enter the password as <password> 
When click on login button
Then Home page should display
Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|

@smoke
Scenario: Test using invalid credentials

And Enter the user name as demosalesmanager
And Enter the password as crmsfa123 
When click on login button
But Error message should display 