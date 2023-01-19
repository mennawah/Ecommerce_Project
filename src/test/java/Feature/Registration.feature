

Feature: user Register to e-commerce website

    Scenario: user register with valid data
        Given user open browser
        And navigates to login page
        When user enter click on register
        And  enters valid data
        Then user register successfully
