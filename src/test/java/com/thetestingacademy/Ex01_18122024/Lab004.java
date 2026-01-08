package com.thetestingacademy.Ex01_18122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab004 {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");
        driver.manage().window().maximize();
    }
}
