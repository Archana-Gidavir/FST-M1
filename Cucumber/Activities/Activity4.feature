@activity4
Feature: Data driven test without Example

@SmokeTest
Scenario: Testing Login without Examples
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close the Web Browser