package SeleniumUjProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class DefaultPage {

    protected WebDriver driver;

    protected DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    protected void fillElement(WebElement element, String value) {
        element.clear(); // wyczyszczenie pola!
        element.sendKeys(value); // uzupelnienie pola pustego
    }

    protected void clickElement(WebElement element) {
        // opjonalnie - dodac oczekiwanie na element -  pomocnicza metoda na kazdy click
        element.click();
    }

    protected void selectCheckbox(WebElement element, boolean checked) {
        if (!element.isSelected()) {
            if (checked) {
                element.click();
            }
        } else {
            if (!checked) {
                element.click();
            }
        }
    }


    protected boolean isElementDisplayed(WebElement element) {
        // OPCJONALNIE - dodać oczekiwanie na element
        return element.isDisplayed();
    }
}
