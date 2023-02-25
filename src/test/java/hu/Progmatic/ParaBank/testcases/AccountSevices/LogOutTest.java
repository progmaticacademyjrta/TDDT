package hu.Progmatic.ParaBank.testcases.AccountSevices;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogOutTest extends DriverBaseTest {

    HomePage homePage;


    @Test(description = "Tests Log out title")
    public void LogOutTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();

        //ide kell még hogy törölje az adatbázist
    }
}
