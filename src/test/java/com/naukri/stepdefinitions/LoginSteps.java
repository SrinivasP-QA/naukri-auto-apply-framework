package com.naukri.stepdefinitions;

import com.naukri.factory.DriverFactory;
import com.naukri.pages.LoginPage;
import com.naukri.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps { 

    LoginPage loginPage =
            new LoginPage(DriverFactory.getDriver());

    @Given("User launches Naukri application")
    public void launchApplication() {

        System.out.println("Naukri Opened");
    }
@When("User enters username and password")
public void enterCredentials() {

    loginPage.clickLoginLink();

    System.out.println("Username : " +
            ConfigReader.getProperty("username"));

    System.out.println("Password : " +
            ConfigReader.getProperty("password"));

    loginPage.enterEmail(
            ConfigReader.getProperty("username"));

    loginPage.enterPassword(
            ConfigReader.getProperty("password"));
}

    @When("User clicks on Login button")
    public void clickLogin() {

        loginPage.clickLoginButton();
    }

    @Then("User should be logged in successfully")
    public void verifyLogin() {

        System.out.println("Login Successful");
    }

    @Then("user clicks on the complete profile")
    public void clickCompleteProfile() {

        loginPage.clickoncompleteProfile();
    }

    @Then("clicks on icon edit and clicks on Save and print a message of profile last update today")
    public void clickEditAndSave()
    {
          loginPage.editOneTheme();
          loginPage.saveChanges();
          loginPage.getLastUpdateTime();
    }
    @Then("User clicks on crosslayer and display a message of Profile updated successfull")
    public void clickCrossLayer() {
        loginPage.crosslayer();
    }

    






}