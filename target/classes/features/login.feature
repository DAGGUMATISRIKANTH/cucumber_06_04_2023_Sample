Feature: Application login

Background:
Given validate the browser
When browser is triggered
Then check if browser gets started

@RegTest
Scenario: Home page Default login 
Given user is on Netbanking landing page
When user logging into application with username and password
Then home page is populated
And cards displayed are "true"

@SmokeTest
Scenario: Home page login with Admin Username and password
Given user is on Netbanking landing page
When user logging into application with "sri" and password "1234"
Then home page is populated
And cards displayed are "false"

@SanityTest
Scenario: Home page  login with valid form details
When user signup with following details
|kandu| chalikotu | pin-523105|sri@123| native-hyderabad|

@RegTest
Scenario Outline: logging with different credentials
When user log into application with <Username> and <password>
Examples:
   |Username| password |
   |user1   | pass1    |
   |user2   | pass2    |
   |user3   | pass3    |
   |user4   | pass4    |
   



