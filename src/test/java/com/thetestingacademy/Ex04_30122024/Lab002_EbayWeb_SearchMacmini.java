package com.thetestingacademy.Ex04_30122024;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
public class Lab002_EbayWeb_SearchMacmini {
    @Test
    public void testMethod() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> searchTitlePrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchTitles.size(), searchTitlePrices.size());
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            if (searchTitles.get(i).getText().isEmpty())
                continue;

            System.out.println("Title : " + searchTitles.get(i).getText() + " || Price : " + searchTitlePrices.get(i).getText());
        }
        driver.quit();
    }
}
