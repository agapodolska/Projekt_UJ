package SeleniumUjProject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CustomDriverFactory {

    private CustomFile customFile;

    public CustomDriverFactory() {
        customFile = new CustomFile();
    }
    public WebDriver getConfiguredDriver (String driverType) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITY_WAIT, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver (String driverType, long implicityWait) {
        return getConfiguredDriver(driverType, implicityWait, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver (String driverType, boolean windowMaximize) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITY_WAIT, windowMaximize);
    }

    public WebDriver getConfiguredDriver(String browserTyoe, long implicityWait, boolean windowMaximize){
        WebDriver driver;
        if (browserTyoe.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", CustomFile.getDriverFilePath(BaseProperties.CHROME_DRIVER_FILE_NAME));
            driver = new ChromeDriver();
        }
            else if (browserTyoe.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", CustomFile.getDriverFilePath(BaseProperties.FIREFOX_DRIVER_FILE_NAME));
                driver = new FirefoxDriver();
        }
                else {
            System.setProperty("webdriver.chrome.driver", CustomFile.getDriverFilePath(BaseProperties.CHROME_DRIVER_FILE_NAME));
            driver = new ChromeDriver();
            }
                driver.manage().timeouts().implicitlyWait(implicityWait, TimeUnit.SECONDS);

                driver.manage().window().maximize();

        return driver;
        }


}
