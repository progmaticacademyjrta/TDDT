package hu.Progmatic.ParaBank.testcases.accountsevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.LogOutPage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class LogOutTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    LogOutPage logOutPage;
    AdminPagePage adminPagePage;

    @Test(groups= "accountServices", description = "Test Case Key: TDDT-T29")
    public void logOutTestCase() {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);


        homePage.loadHomePage();
        registerPage.register();
        logOutPage.logOut();

    }
}
