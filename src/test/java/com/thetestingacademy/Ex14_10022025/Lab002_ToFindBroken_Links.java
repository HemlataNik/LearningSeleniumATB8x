package com.thetestingacademy.Ex14_10022025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Lab002_ToFindBroken_Links {
    public static void main(String args[]) {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/links");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links are " + links.size());

        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }
    }

//    steps to identify broken links in Selenium

//    Use <a> tag to fetch all the links present on a web page
//    Send HTTP request for the link
//    Verify the HTTP response code for the link
//    Determine if the link is valid or it is broken based on the HTTP response code
//    Repeat the process for all links captured with the first step

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();


            if (httpURLConnection.getResponseCode() == 200)
            {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }
}