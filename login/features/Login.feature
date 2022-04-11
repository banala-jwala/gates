Feature: Login

  Scenario: successful login with valid credentials
    Given user lanch chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user opes Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then page title Should  be "your store.Login"
    And close browser
