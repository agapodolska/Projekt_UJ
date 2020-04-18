package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEnvironmentPage extends DefaultPage {

    @FindBy(id="name")
    private WebElement nameField;

    @FindBy(id="description")
    private WebElement descriptionField;

    @FindBy(id="save")
    private WebElement saveButton;

    public AddEnvironmentPage(WebDriver driver) {
        super(driver);
    }
    public AddEnvironmentPage fillAddEnvironmentForm (String environmentName, String environmentDescription){
        fillElement(nameField, environmentName);
        if (environmentDescription != null){
            fillElement(descriptionField, environmentDescription);
        }
        return this;
    }

    public EnvironmentPage submitAddEnvironmentForm (){
        clickElement(saveButton);
        return new EnvironmentPage(driver);
    }
}
