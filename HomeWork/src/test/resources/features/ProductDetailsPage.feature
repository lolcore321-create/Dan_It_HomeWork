Feature: Product Details Page functionality verification

  Scenario: Verify user can be navigated to the correct product details page
    Given User opens Home Page
    When User enters "xox" word into search field on Home Page
    And User clicks on search button on Home Page
    And User remember 2 product name on Search Result Page
    And User clicks on 2 product picture on Search Result Page
    Then User verify product title is correct on Product Details Page


  Scenario: Verify product details after opening product from catalog
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And User clicks on category TV on Home Page
    And User clicks on subcategory on Category Page
    Then User checks the name to verify they have entered the correct subcategory
