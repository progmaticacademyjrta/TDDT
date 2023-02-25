package hu.Progmatic.ParaBank.testcases.CustomerLogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    AdminPagePage adminPagePage;

    @Test
    public void homepageLoadedTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        homePage.loadHomePage();
        registerPage.Register();
        Thread.sleep(1000);
        adminPagePage.clean();
    }

}
