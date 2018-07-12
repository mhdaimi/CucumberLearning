Feature: Test the Newtours website
@SmokeTest
Scenario: Login to the website
Given I am at homepage of newtours website
When I enter username and password
| useName | password |
| batman  | batman   |
And click login button
Then I am logged in and booking page is displayed

Scenario: Search for a one way flight from Frankfurt to Sydney
Given I am on the booking page
When I select one way journey
And source as Frankfurt
And destination as Sydney
And click the search button
Then I see the list of available flights

Scenario: Search and select a flight
Given I am on the booking page
When I select one way journey
And source as Frankfurt
And destination as Sydney
And click the search button
Then I see the list of available flights
