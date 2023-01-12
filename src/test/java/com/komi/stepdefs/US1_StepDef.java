package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US1_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @Then("validate the thumbnails are loaded and visible")
    public void validate_the_thumbnails_are_loaded_and_visible() {
        Driver.scrollToTheBottom();
        Driver.waitFor(2);

        for (WebElement w : profilePage.thumbnails) {
            Driver.scrollToElement(w);
            Assert.assertTrue(w.getAttribute("class").contains("isLoaded"));
        }
    }
}