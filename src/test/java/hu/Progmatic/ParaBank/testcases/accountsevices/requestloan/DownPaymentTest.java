package hu.Progmatic.ParaBank.testcases.accountsevices.requestloan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class DownPaymentTest extends DriverBaseTest {

    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T19")
    public void downPaymentBoundaryValue500Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue500();
    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T20")
    public void downPaymentBoundaryValue501Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue501();
    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T18")
    public void downPaymentBoundaryValue499Invalid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        requestLoanPage.getBoundaryValues();
        adminPagePage.downPayment();
        registerPage.register();
        requestLoanPage.boundaryValue499();
    }
}
