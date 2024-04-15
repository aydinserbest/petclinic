package org.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)    //serenity-cucumber dependency
@CucumberOptions(plugin = "pretty",
        features = "src/test/resources/features")
public class CucumberTestSuite {
}
