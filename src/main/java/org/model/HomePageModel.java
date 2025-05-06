package org.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel {

    WebDriver driver;

    public HomePageModel(WebDriver wd) {
        this.driver = wd;
    }

    String productXpath = "//div[@class='listing-tem']//a/span[text()='%s']";

    public void clickItem(String itemName){
        String itemTextLink = productXpath.replace("%s", itemName);
        By itemTextLinkLocator = By.xpath(itemTextLink);
        WebElement itemElement = driver.findElement(itemTextLinkLocator);
        scrollToElement(itemElement);
        itemElement.click();

    }

    public void scrollToElement(WebElement element){
        ( (JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
