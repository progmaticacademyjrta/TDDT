package hu.Progmatic.ParaBank.testcases;

import hu.Progmatic.ParaBank.pages.HomePage;
import hu.Progmatic.ParaBank.pages.ProfilePage;
import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import hu.Progmatic.ParaBank.pages.AppointmentPage;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {
    HomePage homePage;
    AppointmentPage appointmentPage;
    ProfilePage profilePage;

    @Test
    public void ProfilButtonTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        profilePage = new ProfilePage(driver,wait);

        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        appointmentPage.Login();
        profilePage.ProfilePageButtonTest();

    }
}
