package hu.Progmatic.ParaBank.testcases.accountsevices.requestloan;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AdminPagePage;
import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.RegisterPage;
import hu.Progmatic.ParaBank.pages.RequestLoanPage;
import org.testng.annotations.Test;

public class CombinedTest extends DriverBaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AdminPagePage adminPagePage;
    RequestLoanPage requestLoanPage;

    @Test (description = "Test Case Key: TDDT-T27")
    public void combinedBoundaryValue500Valid() throws InterruptedException {
        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue500();
    }

    @Test (description = "Test Case Key: TDDT-T28")
    public void combinedBoundaryValue501Valid() throws InterruptedException {
        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue501();
    }

    @Test (description = "Test Case Key: TDDT-T26")
    public void combinedBoundaryValue499Invalid() throws InterruptedException {

        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);


        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue499();
    }

    @Test (description = "Test Case Key: TDDT-T25")
    public void combinedBoundaryValue1001Invalid() throws InterruptedException {

        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);

        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue1001();
    }

    @Test (description = "Test Case Key: TDDT-T24")
    public void combinedBoundaryValue1000Valid() throws InterruptedException {

        homePage = new HomePage(driver,wait);
        registerPage = new RegisterPage(driver,wait);
        adminPagePage = new AdminPagePage(driver,wait);
        requestLoanPage = new RequestLoanPage(driver,wait);


        adminPagePage.combined();
        registerPage.register();
        requestLoanPage.boundaryValue1000();
    }
}
