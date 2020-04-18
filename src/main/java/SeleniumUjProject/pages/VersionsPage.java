package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VersionsPage extends DefaultPage {

    @FindBy(xpath ="//html/body/div[1]/section/article/div[1]/nav/ul/li/a")
    private WebElement addVersionButton;

    @FindBy(id = "j_info_box")
    private WebElement infoBox;

    public VersionsPage(WebDriver driver) {
        super(driver);
    }
    public AddVersionPage openAddVersionPage(){
        clickElement(addVersionButton);
        return new AddVersionPage(driver);

    }
    public boolean isInfoBoxDisplayed(){
        return isElementDisplayed(infoBox);
    }
}
