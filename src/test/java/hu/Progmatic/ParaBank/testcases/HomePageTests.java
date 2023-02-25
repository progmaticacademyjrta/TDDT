package hu.Progmatic.ParaBank.testcases;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }
    @Test
    public void homepageMakeAppointmentButtonTest(){
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
    }


}
