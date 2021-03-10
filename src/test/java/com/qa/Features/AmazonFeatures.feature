Feature: Validating the amazon application
Background: Open the browser and lauch URL
Given the user is on Amazon page
When the title of page has Amazon

@End2EndTest
Scenario: Check application to search an item
Given the user should select Books as Category
Then Enter Da vinci code in search text box
And click the magnifier button
Then check if all the items are loaded
Then the title should have search term
Then close the browser

@SmokeTest@End2EndTest
Scenario: Check the application for registration process
Given the user does Mouse over on account and list
Then click start here link
Then the user should be landed on registration page
Then close the browser

@SmokeTest
Scenario: Check the application for registration process
Given the user does Mouse over on account and list
Then close the browser