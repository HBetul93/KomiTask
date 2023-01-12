@US7 @subscription
Feature: Subscription

  Background: Subscribe Section
    When the user on the Subscribe module
    And clicks on SignUp statement


  Scenario Outline: HP - Valid Name and Email
    When the user types valid name "<name>"
    And the user types valid email "<e-mail>"
    Then clicks the submit button
    Then should subscribe successfully
    Examples:
      | name   | e-mail                |
      | Hicret | hbkaragoz34@gmail.com |


  Scenario Outline: NS - Invalid Name
    When the user types invalid name "<name>"
    And the user types valid email "<e-mail>"
    Then clicks the submit button
    Then name "<name error message>" message should appear
    Examples:
      | name | e-mail                | name error message   |
      |      | hbkaragoz34@gmail.com | Please fill this out |


  Scenario Outline: NS - Invalid Email
    When the user types valid name "<name>"
    And the user types invalid email "<e-mail>"
    Then clicks the submit button
    Then email "<email error message>" message should appear
    Examples:
      | name   | e-mail            | email error message             |
      | Hicret |                   | Please enter your email address |
      | Hicret | @gmail.com        | Please enter a valid email      |
      | Hicret | @g.com            | Please enter a valid email      |
      | Hicret | hbkaragoz34@.com  | Please enter a valid email      |
      | Hicret | hbkaragoz34@gmail | Please enter a valid email      |
      | Hicret | ++} ??            | Please enter a valid email      |