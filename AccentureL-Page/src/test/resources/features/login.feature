




@tag
Feature: Loging test
  As a user i should be able to log in so i can see my profile page


  @loginvalid
  Scenario: As a user i should be able to log in with valid credentials
    Given user open the browser to the page 
    And user enter to the loging page
    When user enter valids email address "test800@hotmail.com"
    And user enter valids password "test123"
    And user clic the sign in button
    When user enter to Woman section
    And user clic on t-shirt
    Then user should be in the profile page
    
   
    @invalidemail
      Scenario: As a user i should not be able to log in with invalid email
    Given user open the browser to the page 
    And user enter to the loging page
    When user enter invalids email address "tesst800@hotmail.com"
    And user enter valids password "test123"
    And user clic the sign in button
    When user clic to add to cart
    Then user should not be in the profile page
    
    
    @blankemail
     Scenario: As a user i should not be able to log in without email
    Given user open the browser to the page 
    And user enter to the loging page
    When user enter valids password "test123"
    And user clic the sign in button
    Then user should not be in the profile page

    @blankpassword
   Scenario: As a user i should not be able to log in without password
    Given user open the browser to the page 
    And user enter to the loging page
    When user enter valids email address "test800@hotmail.com"
    And user clic the sign in button
    Then user should not be in the profile page
    