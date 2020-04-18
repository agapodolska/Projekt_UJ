package SeleniumUjProject.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;

public class LoginPage extends DefaultPage{

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "remember")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "login")
    private WebElement submitButton;

    public LoginPage (WebDriver driver){
       super(driver);
    }

    public LoginPage fillLoginForm(String email, String password, boolean remember) {

        fillElement(emailField, email);
        fillElement(passwordField, password);
        selectCheckbox(rememberMeCheckbox, remember);
        return this;
    }

    public DashboardPage submitLoginForm(){
        clickElement(submitButton);
        return new DashboardPage(driver);

    }
}
