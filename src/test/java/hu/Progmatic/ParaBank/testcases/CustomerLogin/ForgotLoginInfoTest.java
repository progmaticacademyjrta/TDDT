package hu.Progmatic.ParaBank.testcases.CustomerLogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.*;
import org.testng.annotations.Test;

public class ForgotLoginInfoTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    LogOutPage logOutPage;

    ForgotLogInInfoPage forgotLogInInfoPage;
    AdminPagePage adminPagePage;
    @Test
    public void Forgot() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);
        forgotLogInInfoPage = new ForgotLogInInfoPage(driver, wait);
        adminPagePage.clean();
        homePage.loadHomePage();
        registerPage.Register();
        logOutPage.LogOut();
        forgotLogInInfoPage.forgotLogIn();
        adminPagePage.clean();
    }
}
