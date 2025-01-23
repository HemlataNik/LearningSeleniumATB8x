package com.thetestingacademy.Ex11_23012025_ActionsAdvance;

import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab003_DragNDrop_Actions {
     ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Description("Verify Drag and Drop")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Source and Destination.
        // from and to

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from, to).build().perform();
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
