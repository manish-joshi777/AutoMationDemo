package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Constants;
import utils.ReadConfigs;

import java.io.IOException;

public class WebDriverController {
    private WebDriver driver;

    public WebDriver createDriver()  {

        String browser = null;
        try {
            browser = new ReadConfigs().getConfigPropValues("browser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", Constants.PATH + "/src/test/java/resources/drivers/chromedriver");
            //System.setProperty("webdriver.chrome.driver", "/media/manish/data2/IJ/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", Constants.PATH + "/src/test/java/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;

    }

    public WebDriver getDriver()  {
        if(driver == null) driver = createDriver();
        return driver;
    }

    public void closeDriver() {
        if (driver !=null) {
            driver.close();
            driver.quit();
        }
    }


}
