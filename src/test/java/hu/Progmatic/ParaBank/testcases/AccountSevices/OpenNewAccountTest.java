package hu.Progmatic.ParaBank.testcases.AccountSevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.OpenNewAccountPage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends DriverBaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    OpenNewAccountPage openNewAccountPage;
    AdminPagePage adminPagePage;

    @Test
    public void OpenNewAccountTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        openNewAccountPage = new OpenNewAccountPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        adminPagePage.clean();
        homePage.loadHomePage();
        registerPage.Register();
        openNewAccountPage.NewAccount();
        adminPagePage.clean();

    }
}
