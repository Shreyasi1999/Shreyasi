Feature: feature to test search functionality

Scenario Outline: Check search is successful or not
Given user is on the search page "https://www.google.com/"
When user enters '<search>' data
And click on search
Then user is navigated to the search page

Examples:
|search |
|java |
|selenium |