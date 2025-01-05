package Ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab002_ESPOCRM_CreateContact {
    @Test
    public void CreateAccount_test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.us.espocrm.com/?l=en_US#Contact");
        driver.manage().window().maximize();

        String CurrentURL = driver.getCurrentUrl();

        Assert.assertEquals(CurrentURL, "https://demo.us.espocrm.com/?l=en_US#Contact");
        System.out.println(driver.getTitle());
        Thread.sleep(8000);

        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();
        Thread.sleep(4000);

        WebElement creat_Cont = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"header-buttons btn-group pull-right\"]")));
        System.out.println(creat_Cont.getText());
        creat_Cont.click();
        Thread.sleep(6000);

        Thread.sleep(8000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class=\"col-sm-3 col-xs-3\"]"))).click().perform();
       action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"option\"])[3]"))).click().perform();

        WebElement firstname=driver.findElement(By.xpath("//input[@data-name='firstName']"));
        firstname.sendKeys("Hemlata");
        WebElement lastname=driver.findElement(By.xpath("//input[@data-name='lastName']"));
        lastname.sendKeys("Nikam");
        Thread.sleep(9000);

        WebElement saveButton= driver.findElement(By.xpath("//button[@data-action='save']"));
        saveButton.click();
    }
}