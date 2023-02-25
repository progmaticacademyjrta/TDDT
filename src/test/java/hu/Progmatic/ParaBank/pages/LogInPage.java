package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogInPage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;

    By usernameby = By.name("username");
    By pwdby = By.name("password");

    By loginbuttonby = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By successby = By.className("title");
    public LogInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void logIn() {
        //Megkeresi és kitölti a username mezőt TDDT-vel
        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("TDDT");

        //Megkeresi és kitölti a password mezőt progmatic6-al
        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("progmatic6");

        //Megkeresi és rákattint a login buttonra
        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();

        //Ellenőrzés
        WebElement success = driver.findElement(successby);
        Assert.assertEquals(success.getText(), "Accounts Overview");


    }
}