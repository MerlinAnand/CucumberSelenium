$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Search.feature");
formatter.feature({
  "name": "Test Search functionality and home page of ebay site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test launch of application and home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.i_have_launched_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on ebay home page",
  "keyword": "When "
});
formatter.match({
  "location": "Search.Navigate_To_Ebay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see ebay home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_should_be_able_to_see_ebay_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test search functionality add and remove item to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on ebay home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for \"\u003cSearchItem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I can see search results for \"\u003cSearchItem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I select the \"\u003cFirstItem\u003e\" in the search results",
  "keyword": "Then "
});
formatter.step({
  "name": "I add item to the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "I remove item from the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the item status",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SearchItem",
        "FirstItem"
      ]
    },
    {
      "cells": [
        "Books",
        "BORN IN 1939"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test search functionality add and remove item to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on ebay home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.Navigate_To_Ebay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Books\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.Search_For_Item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see search results for \"Books\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.Verify_Search_Result(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"BORN IN 1939\" in the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_click_the_first_item_in_the_search_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_add_item_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove item from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_click_remove_item_from_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the item status",
  "keyword": "And "
});
formatter.match({
  "location": "Search.verify_the_heading()"
});
formatter.result({
  "status": "passed"
});
});