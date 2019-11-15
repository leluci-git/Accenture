




@tag
Feature: Loging test
  As a user i should be able to log in so i can see my profile page


  @loginvalid
  Scenario: As a user i should be able to log in with valid credentials
      
    Given user enter to the loging page
    When user enter valids email address "test800@hotmail.com"
    And user enter valids password "test123"
    And user clic on sign in
    Then user should be in the profile page
    When user click on woman
    And user clic on t-shirt
    Then user should be in the profile page
    When user clic on Woman
    And user clic on t-shirt
    Then user should be in the Woman page
    When user clic on add to cart a t-shirt
   
    
    
   
    