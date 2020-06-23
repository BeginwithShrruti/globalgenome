package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverManager {

    private static WebDriver driver;

    public static WebDriver getWebdriver(String driverType)
    {
        if(driverType.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverLocation());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;
    }
}
