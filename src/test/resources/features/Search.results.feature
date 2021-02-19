
@t5
Feature:  Search results
  Scenario: table collumn names
    Given user is on login page
    And user login as librarian
    And user clicks on users link
    Then table should have following collumn name:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |