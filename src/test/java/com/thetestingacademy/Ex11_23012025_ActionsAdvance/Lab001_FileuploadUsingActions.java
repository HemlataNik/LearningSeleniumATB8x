package com.thetestingacademy.Ex11_23012025_ActionsAdvance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab001_FileuploadUsingActions {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        Thread.sleep(3000);
        uploadFileInput.sendKeys("E:\\testdata.txt");
        driver.findElement(By.name("submit")).click();
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
