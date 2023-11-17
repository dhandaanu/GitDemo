
@tag
Feature: Login Automation of dsportalapp
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    Given User is on home page
    And clicks on sign in button
    When User enters valid< username> and <password>
    And clicks on login button
    Then User is navigated to home page with status you are logged in
 

Examples:
  |username |password|
  |NinjaCoders|SDET135batch|

   