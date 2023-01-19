Feature: user should be able to search for a product in the search bar

  Scenario: user searches for a product
    Given user open browser
    And navigates to login page
    When user enters a search item in search tab
    Then user can find it

Feature: user can switch between currencies

  Scenario: user searches for a product
    Given user open browser
    And navigates to login page
    Then user change currency

Feature: user can filter with color
  Scenario: user can filter a product with color
    Given user open browser
    And navigates to shoes display page
    When user choose a color from filter option
    Then user can find the item with the color he chooses

Feature: user can select a top
  Scenario: user can select a top
    Given user open browser
    And navigates to login page
    When user can select a top
    Then user can see the selected top displayed


Feature: Adding to shopping cart
  Scenario: user can add a product to shopping cart
    Given user open browser
    And navigates to login page
    When user can select a product and put it in cart
    Then user can see the selected product in the shopping cart


Feature: Adding to Wishlist
  Scenario: user can add a product to Wishlist
    Given user open browser
    And navigates to login page
    When user can select a product and put it in Wishlist
    Then user can see the selected product in the Wishlist

Feature: Making successful order
  Scenario: user can make a successful order
    Given user open browser
    And navigates to login page
    When user can select a product and put it in shopping cart
    And proceed in checkout procedures
    Then user can make a successful order