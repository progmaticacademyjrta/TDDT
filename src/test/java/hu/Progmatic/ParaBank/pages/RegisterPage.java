package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;
    By regButtonby = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By firstNameby = By.id("customer.firstName");
    By lastNameby = By.id("customer.lastName");
    By addressby = By.id("customer.address.street");
    By cityby = By.id("customer.address.city");
    By stateby = By.id("customer.address.state");
    By zipCodeby = By.id("customer.address.zipCode");
    By phoneby = By.id("customer.phoneNumber");
    By ssnby = By.id("customer.ssn");
    By usernameby = By.id("customer.username");
    By passwordby = By.id("customer.password");
    By confirmby = By.id("repeatedPassword");
    By successMessageby = By.xpath("//*[@id=\"rightPanel\"]/h1");
    By registerButtonby = By.cssSelector("input[value='Register']");

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void register() {

        WebElement RegisterButton = driver.findElement(regButtonby);
        RegisterButton.click();


        WebElement FirstNameInput = driver.findElement(firstNameby);
        FirstNameInput.sendKeys("XY");


        WebElement lastnameInput = driver.findElement(lastNameby);
        lastnameInput.sendKeys("YX");


        WebElement addressInput = driver.findElement(addressby);
        addressInput.sendKeys("Dream Bvld.");


        WebElement cityInput = driver.findElement(cityby);
        cityInput.sendKeys("Hope");


        WebElement stateInput = driver.findElement(stateby);
        stateInput.sendKeys("Montana");


        WebElement zipCodeInput = driver.findElement(zipCodeby);
        zipCodeInput.sendKeys("77777");


        WebElement phoneInput = driver.findElement(phoneby);
        phoneInput.sendKeys("+1 555 777");


        WebElement ssnInput = driver.findElement(ssnby);
        ssnInput.sendKeys("asd");


        WebElement usernameInput = driver.findElement(usernameby);
        usernameInput.sendKeys("TDDT");


        WebElement passwordInput = driver.findElement(passwordby);
        passwordInput.sendKeys("progmatic6");


        WebElement confirmInput = driver.findElement(confirmby);
        confirmInput.sendKeys("progmatic6");


        WebElement registerButton = driver.findElement(registerButtonby);
        registerButton.click();


        WebElement successMessage = driver.findElement(successMessageby);
        Assert.assertEquals(successMessage.getText(), "Welcome TDDT");
    }
}
