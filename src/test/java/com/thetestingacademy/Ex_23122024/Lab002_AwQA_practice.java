package com.thetestingacademy.Ex_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Lab002_AwQA_practice {

    public static void main(String args[]) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement first_name = driver.findElement(By.name("firstname"));
        first_name.sendKeys("Hemlata");

        WebElement last_name = driver.findElement(By.name("lastname"));
        last_name.sendKeys("More");

        WebElement gender = driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement exp = driver.findElement(By.id("exp-3"));
        exp.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("24122024");

        WebElement prof = driver.findElement(By.id("profession-1"));
        prof.click();

        WebElement tool = driver.findElement(By.id("tool-2"));
        tool.click();

        WebElement continents = driver.findElement(By.className("controls"));
        continents.click();

        WebElement select = driver.findElement(By.xpath("//option[contains(text(),'Australia')]"));
        select.click();

       WebElement cmd = driver.findElement(By.id("selenium_commands"));
        Select S = new Select(cmd);
        List<WebElement> option =S.getOptions();
        for( WebElement name: option) {
            System.out.println(name.getText());
        }

        WebElement btn = driver.findElement(By.id("submit"));
        System.out.println(btn.isEnabled());
        System.out.println(btn.getText());

       //driver.quit();
        }
}
