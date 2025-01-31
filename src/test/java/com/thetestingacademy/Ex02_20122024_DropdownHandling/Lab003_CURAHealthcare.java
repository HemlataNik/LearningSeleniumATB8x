package com.thetestingacademy.Ex02_20122024_DropdownHandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.*;
public class Lab003_CURAHealthcare {
    // Open the https://katalon-demo-cura.herokuapp.com/
    // Verify the title and search a string in pageSource
    // Add assertion that the Cura heatlh care Service is visible in the page source.

public static void main(String args[]) throws Exception{
    EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

    WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");


    // Alternate way to maximize
    //driver.manage().window().maximize();

    // TestNG Assertion
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

    // AssertJ Assertion
    assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
    assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");


        if (driver.getPageSource().contains("CURA Healthcare Service")) {
        Assert.assertTrue(true);
    } else {
        throw new Exception("Heading Not Found!!");
    }


    // "" - Empty , " " - blank

        driver.quit();


}
}
