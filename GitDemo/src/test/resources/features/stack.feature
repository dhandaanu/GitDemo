Feature: Handling stack options

  Scenario: User clicks gets into stack page 
    Given User is logged in and on Home Page
    When User clicks on stack Get started button or from drop menu stack item
    Then User is on stack Intro page
    
  Scenario: User on operation in stack page  
   Given User is on opertaion stack Intro page
    When user clicks on opertaion in stack
    And User clicks on try here 
    Then  User lands on tryEditor page 
    
  Scenario: User redirected to try me page to run invalid code
    Given User lands on Editor page for invalid code
    When User enters invalid code to run on editor
    | System.out.println("Hi Java"); |
    And User clicks Run to execute code 
    Then User gets a error message and dismisses it
    
   Scenario: User redirected to try me page to run python code
   Given User lands on Editor page valid code
   When User enters python code to run on editor
   | print 'hello'; |
   And User clicks Run to execute pythone code
   Then User gets a valid output
   
   Scenario: The user back to Stack page
   Given The user is on Stack page for clicks on implementation
   When user clicks on implementation
   And User clicks try here for implementation
   Then  from implementaion user lands on tryEditor page
    
   Scenario: User redirected to page to run invalid code
   Given User lands on Editor page
   When User enters invalid code to run on editor for implementation
   | System.out.println("Hi Java"); |
   And User clicks run to execute code for implementation
   Then for implementation user gets a error message and dismisses it
    
   Scenario: User redirected to page to run python code
   Given User lands on Editor page valid code
   When User enters python code to run on editor for implementation
   | print 'hello'; |
   And User clicks Run to execute pythone code for implementation
   Then User gets a valid output for implementaion
   
   Scenario: The user again back to Stack page
   Given The user on Stack page for clicks on Applications
   When user clicks on Applications
   And  clicks try here for Application
   Then from Applications user lands on tryEditor page
    
   Scenario: User redirected to try run invalid code
   Given The user lands on Editor page for Application
   When The user enters invalid code to run on editor for Applications
   | System.out.println("Hi Java"); |
   And for Applications user clicks Run to execute code
   Then for Application user gets a error message and dismisses it
    
   Scenario: User redirected to try run python code
   Given from Applications user lands on tryEditor page
   When The user enters python code to run on editor for Applications
   | print 'hello'; |
   And The user clicks Run to execute pythone code for Application
   Then The user gets a valid output for Application
   
   Scenario: The user again Stack page
   Given The user is on Stack page for click practice quest
   When user clicks on practice questions
   Then User lands on practice page