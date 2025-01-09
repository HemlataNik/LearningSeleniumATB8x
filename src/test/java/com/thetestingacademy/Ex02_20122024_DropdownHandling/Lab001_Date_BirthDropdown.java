package com.thetestingacademy.Ex02_20122024_DropdownHandling;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;
public class Lab001_Date_BirthDropdown {
    @Test
    public void DoBdropdown_Test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,900)");

        WebElement INPUT_BOX = driver.findElement(By.xpath("//div[@class=\"react-datepicker__input-container\"]"));
        INPUT_BOX.click();

        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select y = new Select(year);
        y.selectByValue("1905");

        Thread.sleep(2000);
        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select m = new Select(month);
        m.selectByVisibleText("June");

        WebElement day = driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--003 react-datepicker__day--weekend\"]"));
        day.click();

    }

}
