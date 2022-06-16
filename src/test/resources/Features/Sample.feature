Feature: feature to test opening the browser functionality

@Smoke
Scenario: Verification of the URL
Given open the browser
When enter the "https://www.google.com"
Then Page is displayed