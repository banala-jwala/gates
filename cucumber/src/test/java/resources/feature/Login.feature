Feature: Login Test

  Scenario: check login with valid credentials
    Given user is on login page
    When user enters email and password
    And clicks on login button
    Then user navigated to home page
    And close browser
