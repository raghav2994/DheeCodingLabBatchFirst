package org.testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.utilities.WaitManager;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {


    @Test(description = "Verify if customer is able to login successfully")
    public void verifySuccessLogin() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions(); // =-> What kind of browser we want to use
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.13:4444"),options); // --> Driver from which Server you need to talk and which browser you should work on
        WaitManager wm = new WaitManager(driver);
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhiljda@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
