package hu.Progmatic.ParaBank.testcases.accountsevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AccountServicesInterfacesPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class AccountServicesInterfacesTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AccountServicesInterfacesPage accountServicesInterfacesPage;

    @Test(groups = "accountServices", description = "Test Case Key: TDDT-T30")
    public void accountServicesInterfacesTestCase() {

        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        accountServicesInterfacesPage = new AccountServicesInterfacesPage(driver, wait);

        homePage.loadHomePage();
        registerPage.register();
        accountServicesInterfacesPage.interfacesCheck();

    }
}
