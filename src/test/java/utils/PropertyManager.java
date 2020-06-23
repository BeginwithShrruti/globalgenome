package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = "src/test/resources/configuration.properties";
    private static String driverLocation;
    private static String screenshotLocation;
    private static String dataInputFileLocation;

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance ()
    {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            System.out.println(propertyFilePath);
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
            prop.load(new FileInputStream(propertyFilePath));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        //Get properties from configuration.properties
        driverLocation = prop.getProperty("webdriver.chrome.driver");
        screenshotLocation = prop.getProperty("screenshot.file.location");
        dataInputFileLocation = prop.getProperty("data.file.location");
    }


    public String getDriverLocation() {
        return driverLocation;
    }
    public  String getScreenshotLocation() {
        return screenshotLocation;
    }
    public static String getDataInputFileLocation()
    {
        return dataInputFileLocation;
    }

}