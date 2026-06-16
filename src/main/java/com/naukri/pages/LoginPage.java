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
    private By loginButtonHome = By.xpath("//a[text()='Login']");

    private By email =
            By.xpath("//input[@placeholder='Enter your active Email ID / Username']");

    private By password =
            By.xpath("//input[@placeholder='Enter your password']");

    private By loginButton =
            By.xpath("//button[@type='submit']");


    private By completeProfile = 
            By.xpath("//a[@href='/mnjuser/profile']");      
            
    private By editontheme = 
            By.xpath("//em[text()='editOneTheme']");
            
    private By savbutton = 
            By.xpath("//button[text()='Save']");
            
    private By lastupdate = 
            By.xpath("//span[@class='typ-14Regular mode-date-wrap ']");

    private By crosslayer = 
            By.xpath("//div[@class='success-message-container']/parent::div/preceding-sibling::div/span");    
    
    private By profileupdate =
            By.xpath("//span[text()='Profile updated successfully']");        
            
                   






            
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


  public void clickoncompleteProfile() {
   
    waitUtils.click(completeProfile);
    System.out.println("Complete Profile Clicked");
}

    public void editOneTheme(){
        waitUtils.click(editontheme);
        System.out.println("Edit One Theme Clicked");
    }

    public void saveChanges(){
        waitUtils.click(savbutton);
        System.out.println("Save Button Clicked");
    }

    public String getLastUpdateTime() {
        String lastUpdate = driver.findElement(lastupdate).getText();
        System.out.println("Last Update Time: " + lastUpdate);
        return lastUpdate;

        
    }

    public void crosslayer(){
        waitUtils.click(crosslayer);
        System.out.println("Cross Layer Clicked");

      
    }

}