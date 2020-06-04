Feature: Login Feature

  As a user I want to log in to virgin games account

  Background: User is on Home Page

    Given  I am on Homepage

  Scenario: User should navigate to virgin games login page successfully

    When   I click on Log in link
    Then   I should navigate to login page successfully

    And    I enter username "luckyrbm"
    And    I enter password "xyz123"
    Then   I click on Log in Button
    Then   I should not able to log in and get error message

