package com.thetestingacademy.Ex07_07012025_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab001_multiplelinks {
    @Test
    public void multiplelinks_Test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       List<WebElement> product_link = (List<WebElement>) driver.findElements(By.xpath("//a[text()='Try it Yourself']"));
       int size = product_link.size();
       System.out.println(size);
     for(int i= 0; i< size; i++)
     {
       product_link.get(i).click();
       System.out.println(driver.getTitle());
     }
    }
}
