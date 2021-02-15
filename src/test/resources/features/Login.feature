@test1
Feature: Cybertek Library login
    As a user, I should be able to login .


  Background:  Background:  User is already in login page
    Given user is on login page



    Scenario: login as a librarian
      When user login as librarian
      Then user librarian verifies that "Dshboard" page subtitle is displayed

  Scenario: login as a student
    When user login as student
    Then user student verifies that "Dashboard" page subtitle is displayed

