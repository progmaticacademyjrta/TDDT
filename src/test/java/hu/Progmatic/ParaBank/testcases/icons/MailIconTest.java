package hu.Progmatic.ParaBank.testcases.icons;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.MailIconPage;
import org.testng.annotations.Test;

public class MailIconTest extends DriverBaseTest {
    HomePage homePage;
    MailIconPage mailIconPage;

    @Test(groups = "icons",description = "Test Case Key: TDDT-T17")
    public void mailIconTestCase() {

        homePage = new HomePage(driver, wait);
        mailIconPage = new MailIconPage(driver, wait);

        homePage.loadHomePage();
        mailIconPage.mailIcon();

    }
}
