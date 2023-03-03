package hu.Progmatic.ParaBank.testcases.accountsevices.requestloan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class AvailableFoundsTest extends DriverBaseTest {

    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;


    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T22")
    public void availableFundsBoundaryValue999Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.availableFunds();
        registerPage.register();
        requestLoanPage.boundaryValue999();
    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T23")
    public void availableFundsBoundaryValue1001Invalid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.availableFunds();
        registerPage.register();
        requestLoanPage.boundaryValue1001();
    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T21")
    public void availableFundsBoundaryValue1000Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.availableFunds();
        registerPage.register();
        requestLoanPage.boundaryValue1000();
    }
}
