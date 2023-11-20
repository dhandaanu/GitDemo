 Feature: register Automation of dsportalapp
  I want to use this template for my feature file
 
 Scenario Outline: Check register with invalid credentials
    Given The user opens Register Page
    When The user enters <username> , <password> and <confirmpassword>
    And Clicks on register button
    Then User gets instruction
    Examples: 
      | username    | password     | confirmpassword |
      |             |              |                 |
      | NinjaCoders |              |                 |
    #  | NinjaCoders | SDET135batch |                 |
     # | hgjhjh_(8)  |              |                 |
      #| NinjaCoders | SDET10       |                 |
      #| NinjaCoders |      7860946 |                 |
 
  Scenario Outline: Check register with password missmatch
    Given The user opens Register Page
    When The user enters <username>, <password> and <confirmpassword>
    And Clicks on register button
    Then The User gets an error message for password missmatch	

     Examples: 
       | username            | password        | confirmpassword      |
       |  vijayBharathi22    |ds_algo22        |  SDET136bacc         |


#    Scenario Outline: Check register with valid credentials
 #   Given The user opens Register Page
  #  When The user enters <username> , <password> and <confirmpassword>
  #  Then  The user is navigated to the homepage

  #    Examples:
  #   | username            | password        | confirmpassword      |
   #   |  vijayBharathi22    |ds_algo22        |  ds_algo22              |