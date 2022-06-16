Feature: Home Page

Background:
Given User is on the the browser
When User enters the "https://www.google.com"

Scenario: Check the search functionality
And User enters search data
Then User checks the title of the page

Scenario: Check the link functionality 
And User clicks on the link
Then User checks the search title of the page


