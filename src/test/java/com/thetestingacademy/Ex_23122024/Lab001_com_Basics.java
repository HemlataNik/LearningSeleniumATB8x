package com.thetestingacademy.Ex_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab001_com_Basics {
    public static void main(String args[]) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement make_apoint = driver.findElement(By.id("btn-make-appointment"));
        make_apoint.click();

        Thread.sleep(2000);

        WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
        user_name.sendKeys("John Doe");

        WebElement pass_word = driver.findElement(By.xpath("//input[@name='password']"));
        pass_word.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        //driver.quit();
    }
}
