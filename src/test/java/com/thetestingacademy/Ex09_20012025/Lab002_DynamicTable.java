package com.thetestingacademy.Ex09_20012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Lab002_DynamicTable {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://demo.guru99.com/test/table.html");

        driver.manage().window().maximize();
        WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        int row_count = rows.size();

        for (int p = 0; p < row_count; p++) {
            List<WebElement> columns = rows.get(p).findElements(By.tagName("td"));

            int Column_count = columns.size();
            for (int q = 0; q < Column_count; q++) {
                String value = columns.get(q).getText();
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}