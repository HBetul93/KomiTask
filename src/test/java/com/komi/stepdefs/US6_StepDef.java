package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US6_StepDef {

    ProfilePage profilePage = new ProfilePage();
    List<String> links = List.of("spotify.com", "apple.com", "youtube.com", "deezer.com");

    @When("the user clicks on the More button")
    public void the_user_clicks_on_the_more_button() {
        profilePage.singleMoreBtn.click();
    }

    @Then("all play buttons {string} should have relevant links")
    public void all_play_buttons_should_have_relevant_links(String string) {

        for (int i = 0; i < links.size(); i++) {
            profilePage.singleMusicMoreOptions.get(i).click();
            Driver.switchToTheNewTab();

            String url = Driver.getDriver().getCurrentUrl();
            String expected = links.get(i);
            Assert.assertTrue(String.format("Expected:<%s> But got:<%s>", expected, url), url.contains(expected));

            Driver.returnBackToMainTab();
        }
    }
}