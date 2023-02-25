package hu.Progmatic.ParaBank.testcases.AccountSevices.RequestLoan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class AvailableFoundsTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;

    @Test
    public void RequestLoanAvailableFundsTest() throws InterruptedException {
        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);

        adminPagePage.availableFunds();
        registerPage.Register();
        requestLoanPage.boundaryValue999();
        adminPagePage.availableFunds();
        registerPage.Register();
        requestLoanPage.boundaryValue1000();
        adminPagePage.availableFunds();
        registerPage.Register();
        requestLoanPage.boundaryValue1001();
    }

}
