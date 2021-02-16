package com.cybertek.library.step_definitions;


import com.cybertek.library.pages.LoginWithParameters;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitons {


    // creating my obj for all outside of method
    LoginWithParameters login= new LoginWithParameters();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @When("user login as librarian")
    public void user_login_as_librarian() {
       login.UsernamePasswordInputMethod("librarian");

    }

    @Then("user librarian verifies that {string} page subtitle is displayed")
    public void user_librarian_verifies_that_page_subtitle_is_displayed(String string) {
        Assert.assertTrue(login.dashboardTx.isDisplayed());
        System.out.println("Veryfying page subtitle : "+string);
    }

    @When("user login as student")
    public void user_login_as_student() {
        login.UsernamePasswordInputMethod("student");
    }
    @Then("user student verifies that {string} page subtitle is displayed")
    public void user_student_verifies_that_page_subtitle_is_displayed(String string) {
        LoginWithParameters login= new LoginWithParameters();
        Assert.assertTrue(login.dashboardTx.isDisplayed());
        System.out.println("Veryfying page subtitle : "+string);
    }


















}