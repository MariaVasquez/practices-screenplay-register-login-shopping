# new feature
    
Feature: Register user
    
Scenario: Create user
    Given enter the website YourLogo
    When click the Sign In button to redirect to the authentication page
    And in the modal of creating an account, enter the email and click the Create Account button
           | email               | maria.vasquez1010@gmail.com  |

    And when you reach the Create Account form, the user fills in the fields with the information and click in Register
           | Title               | Mr.              |
           | First Name          | Maria            |
           | Last Name           | Vasquez          |
           | Password            | Prueba.123       |
           | Date of Birth       | 20-09-1998       |
           | Company             | SQA              |
           | Address             | car 36 # 64-84   |
           | City                | Medellín         |
           | State               | Alaska           |
           | Postal Code         |  55745           |
           | Country             | United States    |
           | Mobile phone        | 3587541          |
           | Address Future      | carr prueba 86   |

    Then validate that your account was registered with the message
             | Field               | Value                      |
             | message             | Welcome to your account    |
