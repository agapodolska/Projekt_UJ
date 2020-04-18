package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddVersionPage extends DefaultPage{

    @FindBy(id="name")
    private WebElement nameField;

    @FindBy(id="description")
    private WebElement descriptionField;

    @FindBy(id="save")
    private WebElement saveButton;

    public AddVersionPage(WebDriver driver) {
        super(driver);
    }
    public AddVersionPage fillAddVersionForm (String versionName, String versionDescription){
        fillElement(nameField, versionName);
        if (versionDescription != null){
            fillElement(descriptionField, versionDescription);
        }
        return this;
    }

    public VersionsPage submitAddVersionForm (){
        clickElement(saveButton);
        return new VersionsPage(driver);
    }
}
