@test2
  Feature: Login With Parameters

 Background:  User is already in login page
      Given user is on login page

    @librarian11
    Scenario: Login as librarian11
#      We CAN EVEN MAKE EASIER TO BE ABLE TO LET CUCUMBER LOG IN AS libraian11 just by providing username String
#      When librarian11 enters username "librarian11"
      When user should be able to login as "librarian11"
#      And librarian11 enter password "I61FFPPf"
#      And librarian11 clicks teh sign in button
      Then dashboard should be displayed



    @librarian12
    Scenario: Login as librarian12
#      In THIS EXAMPLE WE DO EACH STEP BY STEP MANUALLY
      When librarian12 enters username "librarian12@library"
      And librarian12 enters password "AOYKYTMJ"
      And librarian12 clicks teh sign in button
      Then dashboard should be displayed
      And  there should be "2840" users


#      Task Scenarios should be done in 2 lines
      @librarian12_2
      Scenario: Login as librarian12 in one line
        When I logged in using "librarian12@library" password "AOYKYTMJ",
        Then dashboard and  "2841 users" should be displayed
