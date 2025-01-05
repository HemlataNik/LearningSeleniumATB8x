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

public class Lab003_ESPOCRM_NegativeTC_CreateCont {
    @Test
    public void Negative_TC01() throws InterruptedException {
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
        Thread.sleep(8000);

        // try to save without entering anything - it should give you error, verify that.

        WebElement saveButton= driver.findElement(By.xpath("//button[@data-action='save']"));
        saveButton.click();
        Thread.sleep(2000);

        //freezing screen for to inspect error msg
        //Goto console tab and enter -> setTimeout(() =>{debugger},6000) after press enter
        //Now try and click inspect web element which disappears

        WebElement error = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"popover fade bottom in\"]")));
        Assert.assertEquals(error.getText(),"Last Name is required");
        System.out.println(error.getText());

    }
}
