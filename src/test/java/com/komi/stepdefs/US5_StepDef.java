package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US5_StepDef {

    @When("the user clicks on the YouTube video at the footer section")
    public void the_user_clicks_on_the_youtube_video_at_the_footer_section() {
        new ProfilePage().youtubePlayBtn.click();
    }

    @Then("the page is redirected to YouTube")
    public void the_page_is_redirected_to_you_tube() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("youtube"));
    }

}
