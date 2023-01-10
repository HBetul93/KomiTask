package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @When("user on the profile page")
    public void user_on_the_profile_page() {

    }

    @Then("validate the thumbnails are loaded and visible")
    public void validate_the_thumbnails_are_loaded_and_visible() {


    }
}