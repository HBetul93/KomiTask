package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_StepDef {

    @When("the user clicks on the {string} section title")
    public void the_user_clicks_on_the_section_title(String title) {
        ProfilePage.findSectionButton(title).click();
    }

    @Then("the user should be on the {string} module")
    public void the_user_should_be_on_the_module(String title) {
        Assert.assertTrue(title + " section is not displayed", ProfilePage.findModuleTitle(title).isDisplayed());
    }
}
