package hu.Progmatic.ParaBank.testcases.accountsevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.BillPayPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class BillPayTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    BillPayPage billPayPage;
    AdminPagePage adminPagePage;

    @Test(groups = "accountServices", description = "Test Case Key: TDDT-T35")
    public void billPayTestCase() throws InterruptedException {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        adminPagePage = new AdminPagePage(driver, wait);
        billPayPage = new BillPayPage(driver, wait);


        homePage.loadHomePage();
        registerPage.register();
        billPayPage.billPay();

    }
}
