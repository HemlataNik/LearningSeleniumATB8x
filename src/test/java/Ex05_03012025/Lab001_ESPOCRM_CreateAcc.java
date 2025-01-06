package Ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

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

            WebElement login = driver.findElement(By.id("btn-login"));
            login.click();
            Thread.sleep(4000);

            WebElement creatAcc = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"fas fa-plus fa-sm\" ]/following-sibling::span")));
            System.out.println(creatAcc.getText());
            creatAcc.click();
            Thread.sleep(4000);

            WebElement Name = driver.findElement(By.xpath("//input[@data-name='name']"));
            Name.sendKeys("HEMLATA");

            WebElement Save = driver.findElement(By.xpath("//button[@data-action='save']"));
            Save.click();
            Thread.sleep(3000);

            WebElement accCreated = driver.findElement(By.xpath("//label[@data-name=\"name\"]/following::div[1]"));
            System.out.println("Account Created Successfully!!" + accCreated.getText());


            WebElement Edit = driver.findElement(By.xpath("(//span[@class=\"fas fa-ellipsis-h\"])[2]"));
            Edit.click();

            WebElement Remove = driver.findElement(By.xpath("//a[@data-action=\"delete\"]"));
            Remove.click();
            Thread.sleep(5000);

            WebElement confirm = driver.findElement(By.xpath("//span[@class=\"confirm-message\"]"));
            System.out.println(confirm.getText());

            WebElement RemoveAcc = driver.findElement(By.xpath("//div[@class=\"btn-group additional-btn-group\"]"));
            RemoveAcc.click();
            System.out.println("Created Account is removed from Account List");

        }
    }

