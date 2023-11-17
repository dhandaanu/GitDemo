Feature: Handling stack options

  Scenario: User clicks gets into stack page 
    Given User is logged in and on Home Page
    When User clicks on stack Get started button 
    Then User is on stack Intro page
   And User clicks on operation in stack
    And user clicks on try here
   # Then User lands on tryEditor page
    
 # Scenario: User redirected to try me page to run invalid code
 #   Given User lands on tryEditor page
 #  When User enters invalid code to run on editor
 #   And User clicks Run to execute code
 #  Then User gets a error message and dismisses it
    
  #  Scenario: User redirected to try me page to run python code
  # Given User lands on tryEditor page
  # When User enters python code to run on editor
  #  And User clicks Run to execute code
  #  Then User gets a valid output