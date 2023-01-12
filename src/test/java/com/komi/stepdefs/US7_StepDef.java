package com.komi.stepdefs;

import com.komi.pages.ProfilePage;
import com.komi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US7_StepDef {

    ProfilePage profilePage = new ProfilePage();

    private void sendName(String name) {
        Driver.waitAndSendText(profilePage.nameBox, name);
    }

    private void sendEmail(String email) {
        Driver.waitAndSendText(profilePage.emailBox, email);
    }

    // SEND TEXT

    @When("the user fills the subscription form with valid credentials")
    public void theUserFillsTheSubscriptionFormWithValidCredentials() {
        sendName("Hicret ");
        sendEmail("hbkaragoz34@gmail.com");
    }

    @When("the user types invalid name {string}")
    public void the_user_types_invalid_name(String string) {
        sendName(string);
    }

    @When("the user types valid email {string}")
    public void the_user_types_valid_email(String string) {
        sendEmail(string);
    }

    @When("the user types valid name {string}")
    public void theUserTypesValidName(String string) {
        sendName(string);
    }

    @And("the user types invalid email {string}")
    public void theUserTypesInvalidEmail(String string) {
        sendEmail(string);
    }

    // OTHER ACTIONS

    @When("the user on the Subscribe module")
    public void the_user_on_the_subscribe_module() {
        Driver.waitAndClick(profilePage.subscribeSection, 5);
    }

    @And("clicks on SignUp statement")
    public void clicks_on_sign_up_statement() {
        Driver.waitAndClick(profilePage.signUpBtn, 5);
    }

    @Then("should subscribe successfully")
    public void shouldSubscribeSuccessfully() {
        Driver.waitForVisibility(profilePage.successMsg, 3).isDisplayed();
    }

    @Then("clicks the submit button")
    public void clicks_the_submit_button() {
        Driver.waitAndClick(profilePage.submitButton, 3);
    }

    @Then("name {string} message should appear")
    public void name_message_should_appear(String message) {
        Assert.assertEquals(message, profilePage.nameErrorMsg.getText());
    }

    @Then("email {string} message should appear")
    public void email_message_should_appear(String emailError) {
        Assert.assertEquals(emailError, profilePage.emailErrorMsg.getText());
    }
}
