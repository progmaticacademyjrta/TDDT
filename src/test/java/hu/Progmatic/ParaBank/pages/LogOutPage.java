package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogOutPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By logoutby = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");

    public LogOutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void logOut() {

        WebElement logoutButton = driver.findElement(logoutby);
        logoutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }
}
