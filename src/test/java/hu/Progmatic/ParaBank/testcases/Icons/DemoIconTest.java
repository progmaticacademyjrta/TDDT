package hu.Progmatic.ParaBank.testcases.Icons;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.DemoIconPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.testng.annotations.Test;

public class DemoIconTest extends DriverBaseTest {
    HomePage homePage;
    DemoIconPage demoIconPage;

    @Test
    public void DemoIconTest(){
        homePage = new HomePage(driver, wait);
        demoIconPage = new DemoIconPage(driver, wait);
        homePage.loadHomePage();
        demoIconPage.demoIcon();

    }
}
