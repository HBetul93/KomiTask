package com.komi.hook;

import com.komi.utilities.ConfigurationReader;
import com.komi.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void openApp() {
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        Driver.closeDriver();
    }
}