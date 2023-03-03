package hu.Progmatic.ParaBank.testcases.icons;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomeIconPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.testng.annotations.Test;

public class HomeIconTest extends DriverBaseTest {

    HomePage homePage;
    HomeIconPage homeIconPage;

    @Test(groups = "icons",description = "Test Case Key: TDDT-T16")
    public void homeIconTestCase() {

        homePage = new HomePage(driver, wait);
        homeIconPage = new HomeIconPage(driver, wait);

        homePage.loadHomePage();
        homeIconPage.homeIcon();

    }
}
