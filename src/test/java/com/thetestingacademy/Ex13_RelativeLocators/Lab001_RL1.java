package com.thetestingacademy.Ex13_RelativeLocators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab001_RL1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Description("Verify JS")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));

        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();

    }
    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
