package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {


    @Before
    public void seTupScenario(){
//        String url= ConfigurationReader.getProperty("url1");
//        Driver.getDriver().get(url);
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        System.out.println("******************************");
        System.out.println("Setting up browser with details");
    }



    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test FAILED");
        }else {
        System.out.println("---Take a screenshot");
        System.out.println("---Closing browser and ");
        }
        System.out.println("******************************");
        Driver.closeDriver();



//    @Before
//    public void seTupScenario(){
////        String url= ConfigurationReader.getProperty("browser");
////        Driver.getDriver().get(url);
////        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
//        System.out.println("---------Setting up browser with futher details...");
//
   }



}
