@SmokeTest2
Feature: Creating the new Category

Scenario: Create New category and user Type

Given Nagigate to Meridian Website
And Fill the username and password input after this  click on the sign in button
And Click on Item dropdown 
And Click on setup dropdown
And Inventory Categories 
Then Verify item caagory page is displayed
And Click on plus icon
And Fill the name input
And Choose the user type
And Click on save
Then Verify the catagory is created



