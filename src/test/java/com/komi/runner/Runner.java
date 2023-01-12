package com.komi.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/report.json",
                "html:target/report.html",
                "rerun:target/fails.txt"},
        features = "src/test/resources/features",
        glue = {"com/komi/stepdefs", "com/komi/hook"}
//        , tags = "@US4"
)
public class Runner {
}