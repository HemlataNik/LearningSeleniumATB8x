package com.thetestingacademy.Ex09_20012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Lab001_URLVerify {
    public static void main(String[] args) throws InterruptedException {
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.rediff.com/");
        List<WebElement> URL = driver.findElements(By.tagName("a"));
        int COUNT = URL.size();
        System.out.println(COUNT);
        for (int i = 0; i <= COUNT; i++) {
            String URL_title = URL.get(i).getTagName();
            System.out.println(URL_title);
        }
    }
}


