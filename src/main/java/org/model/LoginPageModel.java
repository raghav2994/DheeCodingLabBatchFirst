package org.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageModel {

    WebDriver driver;

    public LoginPageModel(WebDriver wd) {
        this.driver = wd;
    }

    private String loginURL = "https://demo.evershop.io/account/login";

    By userNameVariable = By.xpath("//input[@name='email']");

    By passwrodVariable = By.xpath("//input[@name='password']");
    By submitButtonVariable = By.xpath("//button[@type='submit']");


    public LoginPageModel hitTheLoginUrl(){
        driver.get(loginURL);
        return this;
    }

    public LoginPageModel enterCredentials(String username, String password){
        driver.findElement(userNameVariable).sendKeys(username);
        driver.findElement(passwrodVariable).sendKeys(password);
        return this;
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonVariable).click();
    }
}
