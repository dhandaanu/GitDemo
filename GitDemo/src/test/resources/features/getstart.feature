

  Feature: Title of your feature
           I want to use this template for my feature file

 
  Scenario: The user opens DS Algo portal link
    Given The user opens DS Algo portal link
    When  clicks the Get Started button
    Then The user should be redirected to homepage
    
  Scenario: The user open Data Structures
    Given The user clicks Data Structures drop down
    When selects any data structures item from list
    Then alert msg without sign - You are not logged in
 
  Scenario: The user clicks any of the "Get Started" buttons below the data structures 
  Given: User Open Home Page
  When: clicks on any of the Get Started button
  Then: alert with a message You are not logged in