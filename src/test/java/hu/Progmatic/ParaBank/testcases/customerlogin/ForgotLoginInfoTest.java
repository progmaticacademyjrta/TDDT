package hu.Progmatic.ParaBank.testcases.customerlogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.*;
import org.testng.annotations.Test;

public class ForgotLoginInfoTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    LogOutPage logOutPage;
    ForgotLogInInfoPage forgotLogInInfoPage;
    AdminPagePage adminPagePage;

    @Test (description = "Test Case Key: TDDT-T12")
    public void ForgotLogInInfoTestCase() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);
        forgotLogInInfoPage = new ForgotLogInInfoPage(driver, wait);


        homePage.loadHomePage();
        registerPage.register();
        logOutPage.logOut();
        forgotLogInInfoPage.forgotLogIn();

    }
}
