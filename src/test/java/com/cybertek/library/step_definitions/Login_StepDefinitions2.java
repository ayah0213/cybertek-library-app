package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginWithParameters;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions2 {

    LoginWithParameters login = new LoginWithParameters();

// Tried to do in different way than required, where we can implement less codes and do teh things in 1 shot
    @When("user should be able to login as {string}")
    public void user_should_be_able_to_login_as(String string) {
        System.out.println("login as librarian11");
        login.UsernamePasswordInputMethod(string);
    }
    @When("librarian11 clicks teh sign in button")
    public void librarian11_clicks_teh_sign_in_button() {
        login.clickButton();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertTrue(login.dashboardTx.isDisplayed());
    }



    // 2nd way of doing as mr.Gurhan's Task required

    @When("librarian12 enters username {string}")
    public void librarian12_enters_username(String username) {
        System.out.println("login as librarian12");
        login.userInputName.sendKeys(username);
    }

    @When("librarian12 enters password {string}")
    public void librarian12_enters_password(String password) {
        login.passwordInput.sendKeys(password);


    }
    @When("librarian12 clicks teh sign in button")
    public void librarian12_clicks_teh_sign_in_button() {
        login.signUpBtn.click();
    }

    @Then("there should be {string} users")
    public void there_should_be_users(String string) {
        Assert.assertTrue(login.userNameNum.isDisplayed());

    }


    // 3rd TASK Librarian12 snippets
    @When("I logged in using {string} password {string},")
    public void iLoggedInUsingPassword(String username12, String password12) {
        login.userInputName.sendKeys(username12);
        login.passwordInput.sendKeys(password12);
        login.clickButton();
    }


    @Then("dashboard and  {string} should be displayed")
    public void dashboardAndShouldBeDisplayed(String arg0) {
        Assert.assertTrue(login.dashboardTx.isDisplayed());
      Assert.assertTrue(login.userNameNum.isDisplayed());

    }
}