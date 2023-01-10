package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;


public class US6_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @Given("the user goes to profile page")
    public void the_user_goes_to_profile_page() {

    }

    @Given("the user on the Single Music module")
    public void the_user_on_the_single_music_module() {

    }

    @When("the user clicks on the More button")
    public void the_user_clicks_on_the_more_button() {
        profilePage.singleMoreBtn.click();
    }

    @Then("clicks on play button beside the {string} {int} navigate to {string} successfully")
    public void clicks_on_play_button_beside_the_navigate_to_successfully(String icon, int index, String pageLink) {

        Driver.waitAndClick(profilePage.singleMusicMoreOptions.get(index));

        // switch to next tab
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "T");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(pageLink));
        // close tab
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "W");
    }


    List<String> links = List.of("spotify", "apple", "youtube", "deezer");

    @Then("the user click on all play buttons {string}")
    public void the_user_click_on_all_play_buttons(String string) {
        for (int i = 0; i < links.size(); i++) {
            Driver.waitAndClick(profilePage.singleMusicMoreOptions.get(i));
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(links.get(i)));
            Driver.getDriver().navigate().back();
        }
    }


}
