package hu.Progmatic.ParaBank.testcases.CustomerLogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.*;
import org.testng.annotations.Test;

public class LoginTest extends DriverBaseTest {
    HomePage homePage;
    RegisterPage registerPage;
    LogOutPage logOutPage;

    LogInPage logInPage;

    AdminPagePage adminPagePage;
    @Test
    public void LoginTest() {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        adminPagePage.clean();
        homePage.loadHomePage();
        registerPage.Register();
        logOutPage.LogOut();
        logInPage.LoginUsernameBadPwdBad();
        logInPage.LoginUsernameEmptyPwdEmpty();
        logInPage.LoginUsernameOKPwdEmpty();
        logInPage.LoginUsernameEmptyPwdOK();
        logInPage.LoginUsernameBadPwdOK();
        logInPage.LoginUsernameOKPwdBad();
        logInPage.logInSucces();
        adminPagePage.clean();
    }
}
