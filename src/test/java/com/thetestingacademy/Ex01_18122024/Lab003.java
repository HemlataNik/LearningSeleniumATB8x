package com.thetestingacademy.Ex01_18122024;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab003 {
    @Test
    public void test_Selenium() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
    }
