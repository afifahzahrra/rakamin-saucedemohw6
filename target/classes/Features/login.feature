Feature: Login to SauceDemo
  @Positive
  Scenario Outline: Successful Login
    Given I open the SauceDemo website
    When I enter valid username and password
    And I click the login button
    Then I should be logged in

    Examples:
      | username      | password     | status  |
      | standard_user | secret_sauce | success |

  @Negative
  Scenario Outline: Unsuccessful login with password null
    Given I open the SauceDemo website
    When I enter valid username
    And I click the login button
    Then I should see an error message

    Examples:
      | username      |
      | standard_user |