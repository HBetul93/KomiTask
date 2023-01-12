package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Given;

public class Reusable_StepDef {

    @Given("the user goes to profile page")
    public void the_user_goes_to_profile_page() {
        Driver.openApp();
    }

    @Given("the user is on the {string} module")
    public void the_user_is_on_the_module(String title) {
        ProfilePage.findSectionButton(title).click();
    }
}
