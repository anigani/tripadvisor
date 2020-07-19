package com.tripadvisor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver DRIVER;

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\Ani\\workspace\\tripadvisor\\src\\test\\resources\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "F:\\Ani\\workspace\\tripadvisor\\src\\test\\resources\\geckodriver.exe");

        // Create a new instance of the Chrome driver
        DRIVER = new ChromeDriver();
//        DRIVER = new FirefoxDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        DRIVER.quit();
    }
}
