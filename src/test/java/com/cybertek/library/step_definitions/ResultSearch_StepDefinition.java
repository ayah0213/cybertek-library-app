package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Search_Result_Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ResultSearch_StepDefinition {

Search_Result_Page page = new Search_Result_Page();


// Only 1 TEST PASSED STILL WORKING ON IT.
    @Then("table should have following collumn name:")
    public void tableShouldHaveFollowingCollumnName(List<String> results ) {
        System.out.println(page.result.getText());
        Assert.assertEquals(results, page.result.getText());
    }
}

