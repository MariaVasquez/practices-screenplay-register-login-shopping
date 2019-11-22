# new feature
    
Feature: Register user
    
Scenario: Create user
    Given enter the website YourLogo
    When click the Sign In button to redirect to the authentication page
    And in the modal of creating an account, enter the email and click the Create Account button
    And when you reach the Create Account form, the user fills in the fields with the information and click in Register
    Then validate that your account was registered with the message
