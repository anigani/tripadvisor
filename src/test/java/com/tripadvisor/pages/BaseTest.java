package com.tripadvisor.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void setUp() {
        // It downloads and uses the last Chrome Driver
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
