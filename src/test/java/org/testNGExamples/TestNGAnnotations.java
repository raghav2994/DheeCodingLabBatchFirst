package org.testNGExamples;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestNGAnnotations {


    @Test(description = "This TC does the login")
    public void successLogin() throws MalformedURLException {
        System.out.println("This TC does the login");
//        ChromeOptions options = new ChromeOptions();
//        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.13:4444"), options);
//        driver.get("https://demo.evershop.io/account/login");
//        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("akhiljda@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("Password");
//        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

    }


}
