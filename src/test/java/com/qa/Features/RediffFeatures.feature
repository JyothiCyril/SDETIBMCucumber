Feature: Validate Rediff application
Background: Invoke the applciation
Given the user is on Rediff Home page

Scenario: Login Action
Given the user click on signin link
Then enter user name "test@test.com"
Then enter password "mercury"
Then click on signin button
Then close the current browser