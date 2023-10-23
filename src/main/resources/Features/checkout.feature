Feature: Checkout process
  Scenario: Proceed the checkout
    Given I am on the cart page
    When I proceed the checkout
    Then I should be on the checkout information page