@t4
  Feature: Show Records

    Background: User is already in login page
      Given user is on login page
      Given user login as librarian

    Scenario: Login as librarian to show records
      When user clicks on users link
      Then show records should be value of 10
      And show record should have following options:
      |5  |
      |10 |
      |15 |
      |50 |
      |100|
      |200|
      |500|