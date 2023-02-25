package hu.Progmatic.ParaBank.testcases.CustomerLogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    @Test
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        homePage.loadHomePage();
        registerPage.Register();
    }

}
