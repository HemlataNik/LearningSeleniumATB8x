package com.thetestingacademy.Ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Lab004_GoogleTransl {
    @Test
    public void testMethod() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://translate.google.co.in/?sl=auto&tl=en&op=translate");
        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.xpath("//textarea[@class=\"er8xn\"]"));
        text.sendKeys("中国人");
        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//span[@class=\"ryNqvb\"]"));
        System.out.println(result.getText());
        WebElement close = driver.findElement(By.xpath("//button[@aria-label=\"Clear source text\"]"));
        close.click();

    }
}