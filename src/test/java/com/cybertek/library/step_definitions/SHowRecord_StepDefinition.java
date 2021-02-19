package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.ShowRecordPages;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SHowRecord_StepDefinition {

    ShowRecordPages recordPages = new ShowRecordPages();




    @When("user clicks on users link")
    public void user_clicks_on_users_link() {
       recordPages.usersBtnMethod();
    }




    @Then("show records should be value of {int}")
    public void show_records_should_be_value_of(Integer int1) {
        String expected= int1.toString();
        Select select= new Select(recordPages.showRecordBtn);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected,actual);


    }
    @Then("show record should have following numbers")
    public void show_record_should_have_following_numbers(List<String> numbers) {
      Select select = new Select(recordPages.showRecordBtn);
      List<WebElement> list = select.getOptions();
      List<String> allnumbers= new ArrayList<>();
      for (WebElement each : list){
          allnumbers.add(each.getText());
      }
        Assert.assertEquals(numbers,allnumbers);

    }



//
//        Select select = new Select(recordPages.showRecordBtn);
//        System.out.println(select.getFirstSelectedOption());
//        select.getFirstSelectedOption();
//        for (WebElement each :list){
//            if (each.equals(value))
//
//                System.out.println(value);
//            }
//        }

//        int expected =value;
//        Assert.assertTrue(select.getFirstSelectedOption().equals(expected));

//        Select select = new Select(recordPages.showRecordBtn);
//        if (select.getFirstSelectedOption().equals(value)) {
//            System.out.println("values is :" + value);
//        } else {
//            System.out.println("No such a Value");
//       }





//
//    @And("show record should have following {string}")
//    public void showRecordShouldHaveFollowingNumbers() {
//        Select select = new Select(recordPages.showRecordBtn);
//        List<WebElement> listOpt = select.getOptions();
//        for (WebElement each : listOpt) {
//            System.out.println("Following options re: " + each.getText());
//        }

}
