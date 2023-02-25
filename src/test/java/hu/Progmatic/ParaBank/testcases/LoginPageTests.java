package hu.Progmatic.ParaBank.testcases;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void LoginFailedTest(){
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        loginPage.LoginTest();
    }
}
