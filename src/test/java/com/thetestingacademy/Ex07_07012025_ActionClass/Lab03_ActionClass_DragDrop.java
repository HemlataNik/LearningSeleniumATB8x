package com.thetestingacademy.Ex07_07012025_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab03_ActionClass_DragDrop {
    @Test
        public void DragDrop_Test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Actions Task = new Actions(driver);
        WebElement Source = driver.findElement(By.id("column-a"));
        WebElement Target = driver.findElement(By.id("column-b"));
        Task.dragAndDrop(Source,Target).perform();
        /*
        //Different mouse actions
        Task.click();
        Task.moveToElement();
        Task.moveToElement();
        Task.contextClick();
        Task.clickAndHold();
        Task.dragAndDrop();
        Task.doubleClick();
        Task.keyDown();
        Task.keyUp();
        */



    }
}
