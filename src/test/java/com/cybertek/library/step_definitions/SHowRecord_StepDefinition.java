package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.ShowRecordPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SHowRecord_StepDefinition {

    ShowRecordPages recordPages = new ShowRecordPages();

    @When("user clicks on users link")
    public void userClicksOnUsersLink() {
        recordPages.usersBtnMethod();
    }

    @Then("show records should be value of {int}")
    public void showRecordsShouldBeValueOf(int value) {
        recordPages.usersBtn.click();

        Select select = new Select(recordPages.showRecordBtn);
        if (select.getFirstSelectedOption().equals(value)) {
            System.out.println("values is :" + value);
        } else {
            System.out.println("No such a Value");
        }


    }

    @And("show record should have following options:")
    public void showRecordShouldHaveFollowingOptions(List<Integer> users) {
        Select select = new Select(recordPages.showRecordBtn);
        List<WebElement> listOpt = select.getOptions();
        for (WebElement each : listOpt) {
            System.out.println("Following options re: " + each.getText());
        }

    }
}
