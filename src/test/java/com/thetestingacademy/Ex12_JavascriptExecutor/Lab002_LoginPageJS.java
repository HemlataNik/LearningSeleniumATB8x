package com.thetestingacademy.Ex12_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab002_LoginPageJS {

    @Test
    public void test_Login_JS() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement make_apoint = driver.findElement(By.id("btn-make-appointment"));
        js.executeScript("arguments[0].click();",make_apoint);
        Thread.sleep(4000);
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement submit = driver.findElement(By.id("btn-login"));

        js.executeScript("arguments[0].value='John Doe';", username);
        Thread.sleep(2000);
        js.executeScript("arguments[0].value='ThisIsNotAPassword';", pwd);
        Thread.sleep(2000);
         js.executeScript("arguments[0].click();",submit);
}
}

