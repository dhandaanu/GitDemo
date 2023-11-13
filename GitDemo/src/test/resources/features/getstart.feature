
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: The user opens DS Algo portal link
    Given The user opens DS Algo portal link
    And  clicks the "Get Started" button
    Then The user should be redirected to homepage
    And The user clicks "Data Structures" drop down
    And 6 different data structure entries in that dropdown sould come
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
 
 
 