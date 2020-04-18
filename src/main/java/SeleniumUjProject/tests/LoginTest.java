package SeleniumUjProject.tests;

import SeleniumUjProject.pages.LoginPage;
import SeleniumUjProject.utils.BaseProperties;
import SeleniumUjProject.utils.CustomFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends DefaultTest {

    @Test
    public void successLoginTest(){
        Assert.assertTrue(
            new LoginPage(driver)
                .fillLoginForm(
                        BaseProperties.BASE_ADMIN_EMAIL,
                        BaseProperties.BASE_ADMIN_PASSWORD,
                        true)
                .submitLoginForm()
                .isDashboardPageDisplayed());

    }
}
