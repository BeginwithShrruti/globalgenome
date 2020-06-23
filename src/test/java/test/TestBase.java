package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.PropertyManager;
import utils.WebdriverManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null;

    @BeforeSuite
    public void initialize() throws IOException
    {
        driver = WebdriverManager.getWebdriver("chrome");
    }

    @AfterSuite
    public void tearDownTest()
    {
        driver.close();
        driver.quit();
    }
}
