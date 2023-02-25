package hu.Progmatic.ParaBank.testcases.AccountSevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AccountServicesInterfacesPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import org.testng.annotations.Test;

public class AccountServicesInterfacesTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AccountServicesInterfacesPage accountServicesInterfacesPage;

    @Test
    public void accountServicesInterfacesTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        accountServicesInterfacesPage = new AccountServicesInterfacesPage(driver, wait);

        homePage.loadHomePage();
        registerPage.Register();
        accountServicesInterfacesPage.interfacesCheck();

    }
}
