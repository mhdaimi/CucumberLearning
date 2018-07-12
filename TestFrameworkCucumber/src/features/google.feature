Feature: Test google search
Scenario: Launch google and search for a string

Given I am at Google Search home page
When I type Synechron in search text box
And From the suggestion list select first value 
Then The results are displayed