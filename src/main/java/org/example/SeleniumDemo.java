package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.utilities.WaitManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumDemo {


    public static void main(String[] args) throws MalformedURLException {


        // Verify Customer is able to login successfully

      //  ChromeDriver cd = new ChromeDriver();

        ChromeOptions options = new ChromeOptions(); // =-> What kind of browser we want to use
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.13:4444"),options); // --> Driver from which Server you need to talk and which browser you should work on
        WaitManager wm = new WaitManager(driver);
        driver.get("https://demo.evershop.io/account/login");
       // wm.implicitWait(5);
       // wm.explicitWait(3,By.xpath("//input[@name='submit1']"));
       // wm.fluentWait(10,By.xpath("//input[@name='email']"),2);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhiljda@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
}
