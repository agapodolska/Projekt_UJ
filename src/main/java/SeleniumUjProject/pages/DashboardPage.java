package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends DefaultPage{

    @FindBy( xpath = "/html/body/header/div[2]/div[2]/a/span")
    private WebElement logoutButton;

    @FindBy(xpath ="//html/body/aside/div/ul/li[5]/a")
    private WebElement versionsPageMenuItem;

    @FindBy(xpath ="//html/body/aside/div/ul/li[4]/a")
    private WebElement environmentPageMenuItem;

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public boolean isDashboardPageDisplayed(){
        return isElementDisplayed(logoutButton);

    }

    public VersionsPage openVersionsPage(){
        clickElement(versionsPageMenuItem);
        return new VersionsPage(driver);

    }

    public EnvironmentPage openEnvironmentPage(){
        clickElement(environmentPageMenuItem);
        return new EnvironmentPage(driver);

    }


}
