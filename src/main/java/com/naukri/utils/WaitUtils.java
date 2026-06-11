package com.naukri.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

  
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
      
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public WebElement waitForElementClickable(By locator) {
        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForElementVisible(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        waitForElementClickable(locator).click();
    }

    public void sendKeys(By locator, String value) {
        waitForElementVisible(locator).sendKeys(value);
    }
}