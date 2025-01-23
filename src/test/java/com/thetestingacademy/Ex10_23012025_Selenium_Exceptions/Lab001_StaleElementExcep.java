package com.thetestingacademy.Ex10_23012025_Selenium_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab001_StaleElementExcep {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Description("Verify Stale Element Reference Exception")
    @Test
    public void test_actions() {
        try {
            driver.get("https://google.com");
            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            search_inputbox.sendKeys("Testing Academy" + Keys.ENTER);

            // HTML Page (DOM) is not refreshed,
            // Driver will think that, element may or may not available now.
            // I have found the element before refresh.
            //Solution-If you want to fix staleElemet Exception then you want to refind element after DOM/ HTML Page refresh

            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Other Code run can run that's why");
        System.out.println("End of the program");

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