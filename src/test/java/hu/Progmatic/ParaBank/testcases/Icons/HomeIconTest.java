package hu.Progmatic.ParaBank.testcases.Icons;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.DemoIconPage;
import hu.Progmatic.ParaBank.pages.HomeIconPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.testng.annotations.Test;

public class HomeIconTest extends DriverBaseTest {

    HomePage homePage;
    HomeIconPage homeIconPage;

    @Test
    public void HomeIconPage()throws InterruptedException{
        homePage = new HomePage(driver, wait);
        homeIconPage = new HomeIconPage(driver, wait);
        homePage.loadHomePage();
        homeIconPage.homeIcon();

    }
}
