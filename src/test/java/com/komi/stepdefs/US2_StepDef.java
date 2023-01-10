package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @When("the user clicks on the Single Music section")
    public void the_user_clicks_on_the_single_music_section() {

        Driver.waitAndClick(profilePage.singleMusicSection);

    }
    @Then("the user should be on the Single Music module")
    public void the_user_should_be_on_the_single_music_module() {
        Assert.assertTrue(profilePage.SingleMusicTitle.isDisplayed());

    }
    @When("the user clicks on the Music Tracks section")
    public void the_user_clicks_on_the_music_tracks_section() {
        Driver.waitAndClick(profilePage.musicTracksSection);

    }
    @Then("the user on the Music Tracks module")
    public void the_user_on_the_music_tracks_module() {
        Assert.assertTrue(profilePage.musicTracksTitle.isDisplayed());

    }
    @When("the user clicks on the Pre-Save Music section")
    public void the_user_clicks_on_the_pre_save_music_section() {
        Driver.waitAndClick(profilePage.musicTracksSection);

    }
    @Then("the user should be on the Pre-Save Music module")
    public void the_user_should_be_on_the_pre_save_music_module() {
        Assert.assertTrue(profilePage.preSaveTitle.isDisplayed());

    }
    @When("the user clicks on the Subscribe section")
    public void the_user_clicks_on_the_subscribe_section() {
        Driver.waitAndClick(profilePage.subscribeSection);

    }
    @Then("the user should be on the Subscribe module")
    public void the_user_should_be_on_the_subscribe_module() {
        Assert.assertTrue(profilePage.subscribeSection.isDisplayed());

    }

}
