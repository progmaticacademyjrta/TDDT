package hu.Progmatic.ParaBank.testcases.accountsevices;

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

    @Test(groups = "accountServices", description = "Test Case Key: TDDT-T11")
    public void openNewAccountTestCase1() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        openNewAccountPage = new OpenNewAccountPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);


        homePage.loadHomePage();
        registerPage.register();
        openNewAccountPage.newAccountChecking();


    }

    @Test(groups = "accountServices", description = "Test Case Key: TDDT-T15")
    public void openNewAccountTestCase2() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        openNewAccountPage = new OpenNewAccountPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);


        homePage.loadHomePage();
        registerPage.register();
        openNewAccountPage.newAccountSavings();

    }
}
