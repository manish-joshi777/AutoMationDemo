Feature: Customer Login

    @login
    Scenario: Logo presence on customer home page
    Given I lunch the chrome browser
    When I open facebook login page
    Then I Verify that logo present on page
    Then close browser

