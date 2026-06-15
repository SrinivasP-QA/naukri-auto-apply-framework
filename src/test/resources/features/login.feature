Feature: Naukri Login

Scenario: Login to Naukri

Given User launches Naukri application
When User enters username and password
When User clicks on Login button
Then User should be logged in successfully
Then user clicks on the complete profile
Then clicks on icon edit and clicks on Save and print a message of profile last update today
