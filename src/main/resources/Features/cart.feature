Feature: Managing the shopping cart
  Scenario: Remove product from the cart
    Given I have products in the cart
    When I remove a product from the cart
    Then The product should be removed from the cart