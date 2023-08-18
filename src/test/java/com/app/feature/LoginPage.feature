Feature: LoginPage testing

  Background: 
    Given Launch the Application

  @smoke1
  Scenario: Validate the valid username and password
    When Enter the username "Aiite"
    And Enter the password "12345"
    And Click the login button
    Then Validate the home page

  @smoke1
  Scenario: Validate the valid username and password
    When Enter the username "yuvaraj"
    And Enter the password "aiite"
    And Click the login button
    Then Validate the home page
