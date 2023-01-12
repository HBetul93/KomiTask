package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US3_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @When("the user clicks on {string} module's side navigation arrow multiple times")
    public void the_user_clicks_on_module_s_side_navigation_arrow_multiple_times(String string) {
        WebElement element = ProfilePage.findModuleSwiperButtons(string, "right");
        while (element.isEnabled()) {
            element.click();
        }
    }

    @Then("user should see all module tracks")
    public void user_should_see_all_module_tracks() {
        for (int i = 0; i < profilePage.musicModule_musicCard.size(); i++) {
            Assert.assertTrue(profilePage.musicModule_musicCard.get(i).isDisplayed());
        }
    }
}
