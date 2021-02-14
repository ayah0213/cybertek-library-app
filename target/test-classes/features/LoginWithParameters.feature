

  Feature: Login With Parameters
    Scenario: Login as librarian 11
      Given I am at login page
      When I enter username "librarian11@library"
      And I enter password 'I61FFPPf'
      And click teh sign in button
      Then dashboard should be displayed

    Scenario: Login as librarian 12
      Given I am at login page
      When I enter username "librarian12@library"
      And I enter password 'AOYKYTMJ'
      And click teh sign in button
      Then dashboard should be displayed