package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Search_Result_Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultSearch_StepDefinition {

    Search_Result_Page page = new Search_Result_Page();


    @Then("table should have following collumn name:")
    public void table_should_have_following_collumn_name(List<String> columnNames) {
        List <String> list = new ArrayList<>();
        for (WebElement each : page.columns) {
            list.add(each.getText());
            Assert.assertEquals(columnNames,list);
        }



    }
}

