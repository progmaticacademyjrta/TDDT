package hu.Progmatic.ParaBank.testcases.Icons;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomeIconPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.MailIconPage;
import org.testng.annotations.Test;

public class MailIconTest extends DriverBaseTest {
    HomePage homePage;
    MailIconPage milIconPage;

    @Test
    public void MailIconPage()throws InterruptedException{
        homePage = new HomePage(driver, wait);
        milIconPage = new MailIconPage(driver, wait);
        homePage.loadHomePage();
        milIconPage.mailIcon();

    }
}
