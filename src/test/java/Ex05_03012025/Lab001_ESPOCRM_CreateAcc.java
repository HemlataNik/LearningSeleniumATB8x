package Ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import static java.lang.Thread.*;

public class Lab001_ESPOCRM_CreateAcc {
    @Test
    public void CreateAccount_test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");
        driver.manage().window().maximize();


        String CurrentURL = driver.getCurrentUrl();

        Assert.assertEquals(CurrentURL,"https://demo.us.espocrm.com/?l=en_US#Account");
        System.out.println(driver.getTitle());

            Thread.sleep(4000);
        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();

        WebElement creat_Acc = new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"fas fa-plus fa-sm\" ]/following-sibling::span")));
        System.out.println(creat_Acc.getText());

        creat_Acc.click();
        Thread.sleep(4000);

        WebElement NameText=driver.findElement(By.xpath("//input[@data-name='name']"));
        NameText.sendKeys("HEMLATA");

        WebElement SaveButton=driver.findElement(By.xpath("//button[@data-action='save']"));
        SaveButton.click();

        Thread.sleep(3000);

        WebElement Acc_Created = driver.findElement(By.xpath("//label[@data-name=\"name\"]/following::div[1]"));
        System.out.println(Acc_Created.getText());

    }
    }
