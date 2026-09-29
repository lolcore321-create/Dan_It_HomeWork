Feature: Home Page functionality verification

  Scenario: Verify search field works correctly
    Given User opens Home Page
    When User enters "IPhone" word into search field on Home Page
    And User clicks on search button on Home Page
    Then title contains "IPhone" search word on Search Result Page

  Scenario: Verify main catalog menu appears after clicking on catalog button
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    Then Verify main catalog menu appears on Home Page

  Scenario: Verify if the user feedback form is being submitted.
    Given User opens Home Page
    When User clicks on User feedback
    And User enters name "Igor" word into name field
    And User selects message topic on Feedback Page
    And User enters "Some Text Message" text into message field on Feedback Page
    And User enters "test@example.com" email into email field on Feedback Page
    And User clicks on send button on Feedback Page
    Then Verify success message appears on Feedback Page

  Scenario: Verify selected brand product is opened from catalog
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And User clicks on brands category on Home Page
    And User clicks on 'A4Tech' brand on Brands Page
    And User selects first product on Brand Page
    Then Verify product name matches selected product on Product Details Page

