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
    By Faildby = By.className("error");

    public LogInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void invalidUsernameInvalidPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("kecske");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("kecske");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "The username and password could not be verified.");

    }

    public void emptyUsernameEmptyPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "Please enter a username and password.");

    }

    public void validUsernameEmptyPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("TDDT");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "Please enter a username and password.");

    }

    public void emptyUsernameValidPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("progmatic6");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "Please enter a username and password.");

    }

    public void invalidUsernameValidPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("TTTT");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("progmatic6");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "The username and password could not be verified.");

    }

    public void validUsernameInvalidPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("TDDT");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("Bad");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement Faild = driver.findElement(Faildby);
        Assert.assertEquals(Faild.getText(), "The username and password could not be verified.");

    }

    public void validUsernameValidPassword() {


        WebElement userName = driver.findElement(usernameby);
        userName.sendKeys("TDDT");


        WebElement pwd = driver.findElement(pwdby);
        pwd.sendKeys("progmatic6");


        WebElement LoginButton = driver.findElement(loginbuttonby);
        LoginButton.click();


        WebElement success = driver.findElement(successby);
        Assert.assertEquals(success.getText(), "Accounts Overview");

    }
}