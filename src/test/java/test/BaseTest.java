package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.logs.Log;

public class BaseTest {
    public WebDriver driver;
    public HomePage  homePage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
        Log.info("Tests are starting!");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void methodLevelSetup() {
        homePage = new HomePage(driver);
    }


    @AfterClass
    public void teardown() {
        Log.info("Tests are ending!");
        driver.quit();
    }
}