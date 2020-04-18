package SeleniumUjProject.tests;
import org.testng.Assert;
import SeleniumUjProject.pages.DashboardPage;
import org.testng.annotations.Test;

import java.util.Date;

public class AddVersionTest extends DefaultTest{

    @Test
    public void successAddVersionTest(){
        new DashboardPage(driver)
                .openVersionsPage()
                .openAddVersionPage()
                .fillAddVersionForm("version_" + new Date().getTime(), null)
                .submitAddVersionForm()
                .isInfoBoxDisplayed();
        // wejscie w wersje
        // wejscie w dodawanie wersji
        // uzupelnienie nazwy
        // opcja uzupelnienie opisu
        // klik zapisz
        // spr czy dodan
    }
}
