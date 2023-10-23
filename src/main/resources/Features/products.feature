Feature: Adding products to the cart
  Scenario: Add product to the cart
    Given I am logged in
    When I add a product to the cart
    Then The product should be in the cart
