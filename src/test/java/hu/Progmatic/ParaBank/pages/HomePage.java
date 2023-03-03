package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;


    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        System.out.println("Homepage loaded properly.");
    }
}
