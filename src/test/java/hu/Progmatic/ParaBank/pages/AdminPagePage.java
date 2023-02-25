package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPagePage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;
    By cleanby = By.cssSelector("button[value='CLEAN'");

    public AdminPagePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clean(){
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();
    }
}
