package SeleniumUjProject.tests;

import SeleniumUjProject.pages.DashboardPage;
import org.testng.annotations.Test;

import java.util.Date;

public class AddEnvironmentTest extends DefaultTest {
    @Test
    public void successAddEnvironmentTest(){
        new DashboardPage(driver)
                .openEnvironmentPage()
                .openAddEnvironmentPage()
                .fillAddEnvironmentForm("env_" + new Date().getTime(), null)
                .submitAddEnvironmentForm()
                .isInfoBoxDisplayed();
        // wejscie w wersje
        // wejscie w dodawanie wersji
        // uzupelnienie nazwy
        // opcja uzupelnienie opisu
        // klik zapisz
        // spr czy dodan
    }
}
