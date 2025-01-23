package com.thetestingacademy.Ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab003_Ebay_Samsung {

    @Test
    public void testMethod() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("samsung galaxy");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();

        List<WebElement> itemlist = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));
        int size = itemlist.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            if (itemlist.get(i).getText().isEmpty())
                continue;

            System.out.println("Title : " + itemlist.get(i).getText() );
    }
}
}