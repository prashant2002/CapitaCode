Feature: dfmkdfm

#@Test1
#Scenario: Successful Login with Valid Credentials
#Given User is on Home Page
#When User Navigate to LogIn Page
#And User enters UserName and Password
#Then Message displayed Login Successfully
#And close browser

#@Test2
#Scenario: Successful login
#  Given user registration page
#  And I fill in email with "Lastname"
#  And I fill in password with "xyz"
#  When I press login
  
@Test3
Scenario: Successful Regstraion
Given user registration page and the following todos exist:
  When Enter value in "<First Name>"
  And Enter value in "<Last Name>"
  And Enter value in "<Mobile Number>"
   | First Name | Last Name | Mobile Number |
    | FirstName | LastName | 9875643210 |