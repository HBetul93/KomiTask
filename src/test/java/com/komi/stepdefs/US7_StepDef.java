package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US7_StepDef {

    ProfilePage profilePage = new ProfilePage();

    @When("the user on the Subscribe module")
    public void the_user_on_the_subscribe_module() {
        Driver.waitAndClick(profilePage.subscribeSection);

    }
    @And("clicks on SignUp statement")
    public void clicks_on_sign_up_statement() {
        Driver.waitAndClick(profilePage.signUpBtn);

    }
    @Then("fills the subscription form succesfully")
    public void fills_the_subscription_form_succesfully() {

        Driver.waitAndSendText(profilePage.nameBox,"Hicret Betul",3);
        Driver.waitAndSendText(profilePage.emailBox,"av.hbkaragoz@gmail.com",3);

        Driver.waitAndClick(profilePage.submitButton);

    }

}
