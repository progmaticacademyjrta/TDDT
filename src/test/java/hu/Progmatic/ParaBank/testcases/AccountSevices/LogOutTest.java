package hu.Progmatic.ParaBank.testcases.AccountSevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.LogOutPage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogOutTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    LogOutPage logOutPage;

    AdminPagePage adminPagePage;
    @Test
    public void Forgot() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);
        adminPagePage.clean();
        homePage.loadHomePage();
        registerPage.Register();
        logOutPage.LogOut();
        adminPagePage.clean();
    }
}
