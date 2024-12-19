package com.thetestingacademy.Ex01_18122024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab001 {
    @Test
    public void test_Selenium() {

        // In Selenium 3
//        System.setProperty("webdriver.gecko.driver", "path/to/firefoxdriver");

        // Selenium 4
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
