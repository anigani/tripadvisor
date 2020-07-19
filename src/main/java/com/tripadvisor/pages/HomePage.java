package com.tripadvisor.pages;

import com.tripadvisor.pages.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    private final String URL = "https://www.tripadvisor.com/";

    @FindBy(xpath = "//*[@class='i3bZ_gBa _3TPJs5_m']")
    private WebElement searchForm;

    @FindBy(xpath = "//*[@name='q']")
    private List<WebElement> searchInputs;

    public HomePage(WebDriver driver) {
        super(driver);
        // Go to the home page
        driver.get(URL);
    }

    public void search(String input) {
        searchForm.click();
        WebElement searchInput = searchInputs.get(1);
        searchInput.sendKeys(input);
        searchInput.sendKeys(Keys.ENTER);
    }

}
