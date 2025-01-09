package com.thetestingacademy.Ex06_06012025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab002_ConfirmationAlert {


    @Test
    public void Alert_Test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        button.click();
        Thread.sleep(2000);

        Alert Confirm_alert = driver.switchTo().alert();
        Confirm_alert.accept();
        Thread.sleep(4000);

        String result= driver.findElement(By.id("result")).getText();
        System.out.println(result);
    }
}


