package com.naukri.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import com.naukri.factory.DriverFactory;
import com.naukri.utils.ConfigReader;

public class Hooks {

    @Before
    public void setUp() {

        DriverFactory.initDriver();

        DriverFactory.getDriver()
                .get(ConfigReader.getProperty("url"));

        System.out.println("Browser Launched");
        System.out.println("Current URL : "
                + DriverFactory.getDriver().getCurrentUrl());

        System.out.println("Page Title : "
                + DriverFactory.getDriver().getTitle());
    }

    @After
    public void tearDown() {

     //   DriverFactory.quitDriver();

        System.out.println("Browser Closed");
    }
}