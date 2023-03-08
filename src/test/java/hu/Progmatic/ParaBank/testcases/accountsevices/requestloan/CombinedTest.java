package hu.Progmatic.ParaBank.testcases.accountsevices.requestloan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class CombinedTest extends DriverBaseTest {

    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T27")
    public void combinedBoundaryValue500Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue500();

    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T26")
    public void combinedBoundaryValue499Invalid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue499();

    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T25")
    public void combinedBoundaryValue1001Invalid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue1001();

    }

    @Test(groups = "requestLoan", description = "Test Case Key: TDDT-T24")
    public void combinedBoundaryValue1000Valid() {

        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        requestLoanPage = new RequestLoanPage(driver, wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue1000();

    }
}
