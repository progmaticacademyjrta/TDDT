package hu.Progmatic.ParaBank.testcases.AccountSevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.OpenNewAccountPage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends DriverBaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    OpenNewAccountPage openNewAccountPage;

    @Test
    public void OpenNewAccountTest() {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        openNewAccountPage = new OpenNewAccountPage(driver, wait);
        homePage.loadHomePage();
        registerPage.Register();
        openNewAccountPage.openNewAccount();

        //ide kell még hogy törölje az adatbázist
    }
}
