package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironmentPage extends DefaultPage {
    @FindBy(xpath ="//html/body/div[1]/section/article/div[1]/nav/ul/li/a")
    private WebElement addEnvironmentButton;

    @FindBy(id = "j_info_box")
    private WebElement infoBox;

    public EnvironmentPage(WebDriver driver) {
        super(driver);
    }
    public AddEnvironmentPage openAddEnvironmentPage(){
        clickElement(addEnvironmentButton);
        return new AddEnvironmentPage(driver);

    }
    public boolean isInfoBoxDisplayed(){
        return isElementDisplayed(infoBox);
    }
}
