package SeleniumUjProject.tests;

import SeleniumUjProject.utils.BaseProperties;
import SeleniumUjProject.utils.CustomDriverFactory;
import SeleniumUjProject.utils.CustomFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public abstract class DefaultTest {
    protected static WebDriver driver;

    protected CustomFile customFile;

    @Parameters({"browserType", "implicityWait", "windowMaximize"})
    @BeforeSuite
    public void setUp(String browserType, String implicityWait, String windowMaximize){
        customFile = new CustomFile();
        driver =new CustomDriverFactory().getConfiguredDriver(
                browserType,
                Long.parseLong(implicityWait),
                windowMaximize.equalsIgnoreCase("true"));
        driver.get(BaseProperties.BASE_URL); // wejscie na strone
    }

    @AfterSuite
    public void tearDown(){

        driver.quit(); // zabicie drviera + zamkniecie przegladarki
    }

}
