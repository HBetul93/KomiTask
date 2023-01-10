package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US4_StepDef {

    ProfilePage profilePage =new ProfilePage();

    @When("the user clicks on the Music Tracks module")
    public void the_user_clicks_on_the_music_tracks_module() {

    }
    @Then("chooses a {string} by clicking play and clicks on Pre-Save button")
    public void chooses_a_by_clicking_play_and_clicks_on_pre_save_button(String string) {

    }
    @Then("validate the Pre-Save button changed to Pre-Saved")
    public void validate_the_pre_save_button_changed_to_pre_saved() {

    }

}
