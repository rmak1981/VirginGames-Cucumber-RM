package com.virgingames.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */
public class MyStepdefs {

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        Reporter.addStepLog(" I am on Home Page ");
    }

    @When("^I click on Log in link$")
    public void iClickOnLogInLink() {
        new HomePage().clickOnLogin();
    }
    // to check user is navigated to the log in page I have verified forgotten details text

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        new LoginPage().verifyForgottenDetailsText("Forgotten Details?");
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String userName)  {
        new LoginPage().enterUsernameToField(userName);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPasswordToField(password);

    }

    @Then("^I click on Log in Button$")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLogInBtn();
    }

    @Then("^I should not able to log in and get error message$")
    public void iShouldNotAbleToLogInAndGetErrorMessage() {
        new LoginPage().verifyErrorText("login-form__error-message");

    }
}
