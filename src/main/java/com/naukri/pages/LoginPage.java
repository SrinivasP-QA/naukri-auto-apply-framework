package com.naukri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naukri.utils.WaitUtils;

public class LoginPage {

    WebDriver driver;
    WaitUtils waitUtils;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    // Locators
    private By loginButtonHome = By.id("login_Layer");

    private By email =
            By.xpath("//input[@placeholder='Enter your active Email ID / Username']");

    private By password =
            By.xpath("//input[@placeholder='Enter your password']");

    private By loginButton =
            By.xpath("//button[@type='submit']");






            
    // Actions
    public void clickLoginLink() {
        waitUtils.click(loginButtonHome);
        System.out.println("Login Link Clicked");
    }

    public void enterEmail(String username) {
        waitUtils.sendKeys(email, username);
        System.out.println("Username Entered");
    }

    public void enterPassword(String pwd) {
        waitUtils.sendKeys(password, pwd);
        System.out.println("Password Entered");
    }

    public void clickLoginButton() {
        waitUtils.click(loginButton);
        System.out.println("Login Button Clicked");
    }

    public void login(String username, String pwd) {
        clickLoginLink();
        enterEmail(username);
        enterPassword(pwd);
        clickLoginButton();
    }
}