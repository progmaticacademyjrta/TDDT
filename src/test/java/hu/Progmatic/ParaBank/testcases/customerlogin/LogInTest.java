package hu.Progmatic.ParaBank.testcases.customerlogin;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.*;
import org.testng.annotations.Test;

public class LogInTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    LogOutPage logOutPage;
    LogInPage logInPage;
    AdminPagePage adminPagePage;

    @Test (description = "Test Case Key: TDDT-T3")
    public void logInTestCaseEmptyUsernameAndEmptyPasswordRule1() {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);


        homePage.loadHomePage();

        logInPage.emptyUsernameEmptyPassword();


    }

    @Test (description = "Test Case Key: TDDT-T4")
    public void logInTestCaseEmptyUsernameAndValidPasswordRule2() {

        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);

        homePage.loadHomePage();
        logInPage.emptyUsernameValidPassword();

    }

    @Test (description = "Test Case Key: TDDT-T5")
    public void logInTestCaseValidUsernameAndEmptyPasswordRule3() {

        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);


        homePage.loadHomePage();
        logInPage.validUsernameEmptyPassword();

    }

    @Test (description = "Test Case Key: TDDT-T6")
    public void logInTestCaseValidUsernameAndValidPasswordRule4() {

        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        logOutPage = new LogOutPage(driver, wait);

        homePage.loadHomePage();
        registerPage.register();
        logOutPage.logOut();
        logInPage.validUsernameValidPassword();
        logOutPage.logOut();

    }

    @Test (description = "Test Case Key: TDDT-T7")
    public void logInTestCaseValidUsernameAndInvalidPasswordRule5() {

        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);

        homePage.loadHomePage();
        logInPage.validUsernameInvalidPassword();

    }

    @Test (description = "Test Case Key: TDDT-T8")
    public void logInTestCaseInvalidUsernameAndValidPasswordRule6() {

        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);

        homePage.loadHomePage();
        logInPage.invalidUsernameValidPassword();

    }

    @Test (description = "Test Case Key: TDDT-T9")
    public void logInTestCaseInvalidUsernameAndInvalidPasswordRule7() {


        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);

        homePage.loadHomePage();
        logInPage.invalidUsernameInvalidPassword();

    }
}
