package com.thetestingacademy.Ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lab001_idrive360_login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();

        Thread.sleep(6000);
        WebElement user_input = driver.findElement(By.name("username"));
        user_input.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");

        WebElement sign_in = driver.findElement(By.id("frm-btn"));
        sign_in.click();
        Thread.sleep(10000);

        WebElement freeTrialMessage = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println("Free Trial Message = "+freeTrialMessage.getText());
        Assert.assertEquals(freeTrialMessage.getText(), "Your free trial has expired");




    }
}