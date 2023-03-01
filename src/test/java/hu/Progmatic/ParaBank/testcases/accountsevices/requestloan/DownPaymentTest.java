package hu.Progmatic.ParaBank.testcases.accountsevices.requestloan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class DownPaymentTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;

    @Test(groups = "smoketests", description = "Test Case Key: TDDT-T19")
    public void downPaymentBoundaryValue500Valid() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue500();
    }

    @Test(groups = "smoketests", description = "Test Case Key: TDDT-T20")
    public void downPaymentBoundaryValue501Valid() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue501();
    }

    @Test(groups = "smoketests", description = "Test Case Key: TDDT-T18")
    public void downPaymentBoundaryValue499Invalid() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);


        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue499();
    }
}
