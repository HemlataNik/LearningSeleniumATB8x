package com.thetestingacademy.Ex08_09012025_WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab001_WindowHandling {
    @Test
    public void WindowHandle_Test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        WebElement Text = driver.findElement(By.xpath("//*[@class=\"example\"]/child::h3"));
        String Text1 = Text.getText();
        System.out.println(Text1);

        //Store the main/parent window or driver to String
        String mainWindow = driver.getWindowHandle();

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle: windowHandles)
        {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window"));
            {
                System.out.println("Text 'New Window' was found in new window");
                break;
            }
        }
        //driver.switchTo().window(mainWindow);

        //driver.quit();

    }
}