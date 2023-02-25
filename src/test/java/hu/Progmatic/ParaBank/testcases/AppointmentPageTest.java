package hu.Progmatic.ParaBank.testcases;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AppointmentPage;
import hu.Progmatic.ParaBank.pages.HomePage;
import org.testng.annotations.Test;

public class AppointmentPageTest extends DriverBaseTest {
    HomePage homePage;
    AppointmentPage appointmentPage;

    @Test
    public void AppointmentFullTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        appointmentPage.Login();
        appointmentPage.AppointmentTest();

    }
}
