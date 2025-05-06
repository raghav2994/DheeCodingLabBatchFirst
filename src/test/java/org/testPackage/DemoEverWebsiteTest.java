package org.testPackage;

import org.excelManagerPackage.ExcelManager;
import org.model.HomePageModel;
import org.model.LoginPageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

public class DemoEverWebsiteTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions(); // =-> What kind of browser we want to use
        driver = new RemoteWebDriver(new URL("http://192.168.1.13:4444"),options);
    }



    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() throws IOException {
        return ExcelManager.getData();
    }

    @Test(dataProvider = "LoginData")
    public void testDemoEverWebsite(String UN, String PW) throws Exception {
        LoginPageModel login = new LoginPageModel(driver);
        HomePageModel home = new HomePageModel(driver);
        login.hitTheLoginUrl()
                .enterCredentials(UN,PW)
                .clickSubmitButton();
        Thread.sleep(2000);
        home.clickItem("Nike zoom fly");

    }
}
