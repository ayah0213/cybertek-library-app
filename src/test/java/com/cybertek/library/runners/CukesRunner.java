package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // feature file will read my feature files
        glue = "com/cybertek/library/step_definitions",
        dryRun = true,        // once it true -> allows just to run and get the Snippets, before running actual Test
                                // once its false -> it's turned ON and allows us to run actual codes tests
        tags =""
)
public class CukesRunner {



}
