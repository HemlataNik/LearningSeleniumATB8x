package com.thetestingacademy.Ex01_18122024;
import org.openqa.selenium.edge.EdgeDriver;
public class Lab005 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();

    }
}
