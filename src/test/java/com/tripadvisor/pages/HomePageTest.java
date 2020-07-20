package com.tripadvisor.pages;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest {
    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);

        homePage.search("Yerevan");

        String title = driver.getTitle();

        assertTrue(title.contains("Yerevan"));
    }
}
