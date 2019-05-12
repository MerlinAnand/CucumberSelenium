Feature: Test Search functionality and home page of ebay site

Scenario: Test launch of application and home page
Given I have launched browser
When I am on ebay home page
Then user should be able to see ebay home page

Scenario Outline: Test search functionality add and remove item to cart
Given I am on ebay home page 
When I search for "<SearchItem>"
Then I can see search results for "<SearchItem>"
Then I select the "<FirstItem>" in the search results
Then I add item to the cart
Then I remove item from the cart 
And verify the item status

 Examples:
 
    |SearchItem|FirstItem|
    |Books     |BORN IN 1939|
