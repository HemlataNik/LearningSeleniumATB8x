package Ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

import java.sql.Driver;
import java.sql.DriverAction;
import java.time.Duration;

import static java.lang.Thread.*;

public class Lab001_ESPOCRM_CreateAcc {

        @Test
        public void CreateAccount_test () throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.us.espocrm.com/?l=en_US#Account");
            driver.manage().window().maximize();

            String CurrentURL = driver.getCurrentUrl();

            Assert.assertEquals(CurrentURL, "https://demo.us.espocrm.com/?l=en_US#Account");
            System.out.println(driver.getTitle());
            Thread.sleep(8000);

            WebElement login_btn = driver.findElement(By.id("btn-login"));
            login_btn.click();
            Thread.sleep(4000);

            WebElement creat_Acc = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"fas fa-plus fa-sm\" ]/following-sibling::span")));
            System.out.println(creat_Acc.getText());
            creat_Acc.click();
            Thread.sleep(4000);

            WebElement NameText = driver.findElement(By.xpath("//input[@data-name='name']"));
            NameText.sendKeys("HEMLATA");

            WebElement SaveButton = driver.findElement(By.xpath("//button[@data-action='save']"));
            SaveButton.click();
            Thread.sleep(3000);

            WebElement Acc_Created = driver.findElement(By.xpath("//label[@data-name=\"name\"]/following::div[1]"));
            System.out.println("Account Created Successfully!!" + Acc_Created.getText());


            WebElement Sel_EditDropdown = driver.findElement(By.xpath("(//span[@class=\"fas fa-ellipsis-h\"])[2]"));
            Sel_EditDropdown.click();

            WebElement Remove_name = driver.findElement(By.xpath("//a[@data-action=\"delete\"]"));
            Remove_name.click();
            Thread.sleep(5000);

            WebElement confirm_msg = driver.findElement(By.xpath("//span[@class=\"confirm-message\"]"));
            System.out.println(confirm_msg.getText());

            WebElement remove = driver.findElement(By.xpath("//div[@class=\"btn-group additional-btn-group\"]"));
            remove.click();
            System.out.println("Created Account removed from Account List");

        }
    }

