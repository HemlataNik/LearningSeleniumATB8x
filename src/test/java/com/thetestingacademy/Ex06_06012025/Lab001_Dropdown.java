package com.thetestingacademy.Ex06_06012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab001_Dropdown {

    @Test
    public void DropdownTest () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select S= new Select(dropdown);
        //S.selectByVisibleText("Option 1");
       // S.selectByValue("1");
        S.selectByIndex(2);



    }

    }
