Feature: user should be able to loin

  Scenario: user login with valid data
    Given user open browser
    And navigates to login page
    When user enter valid username and password
    And  user click on login button
    Then user could login successfully

#Feature: user can reset password

  Scenario: user tries to reset password
  Given user open browser
  And navigates to login page
  When user click on forgot password
  And  user enters valid email address
  Then user receives a message to reset password.
