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
    By registerButtonby = By.cssSelector("input[value='Register'");

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void Register() throws InterruptedException {
        //Megkeresi a Register gombot és rá kattint
        WebElement RegisterButton = driver.findElement(regButtonby);
        RegisterButton.click();

        //Megkeresi a Fist Name szöveg dobozt és kitölti a XY-al
        WebElement FirstNameInput = driver.findElement(firstNameby);
        FirstNameInput.sendKeys("XY");

        //Megkeresi a Last Name szöveg dobozt és kitölti a XY-al
        WebElement lastnameInput = driver.findElement(lastNameby);
        lastnameInput.sendKeys("YX");

        //Megkeresi a Adress-t szöveg dobozt és kitölti a Dream Bvld.-al
        WebElement addressInput = driver.findElement(addressby);
        addressInput.sendKeys("Dream Bvld.");

        //Megkeresi a city-t szöveg dobozt és kitölti a Hope-al
        WebElement cityInput = driver.findElement(cityby);
        cityInput.sendKeys("Hope");

        //Megkeresi a State-t szöveg dobozt és kitölti a Montana-al
        WebElement stateInput = driver.findElement(stateby);
        stateInput.sendKeys("Montana");

        //Megkeresi a Zip code-t szöveg dobozt és kitölti a 77777-el
        WebElement zipCodeInput = driver.findElement(zipCodeby);
        zipCodeInput.sendKeys("77777");

        //Megkeresi a Phone #-t szöveg dobozt és kitölti a +1 555 777-al
        WebElement phoneInput = driver.findElement(phoneby);
        phoneInput.sendKeys("+1 555 777");

        //Megkeresi a SSN-t szöveg dobozt és kitölti a asd-al
        WebElement ssnInput = driver.findElement(ssnby);
        ssnInput.sendKeys("asd");

        //Megkeresi a Username-t szöveg dobozt és kitölti a TDDT-al
        WebElement usernameInput = driver.findElement(usernameby);
        usernameInput.sendKeys("TDDT");

        //Megkeresi a Password-t szöveg dobozt és kitölti a progmatic6-al
        WebElement passwordInput = driver.findElement(passwordby);
        passwordInput.sendKeys("progmatic6");

        //Megkeresi a Confirm-t szöveg dobozt és kitölti a progmatic6-al
        WebElement confirmInput = driver.findElement(confirmby);
        confirmInput.sendKeys("progmatic6");

        WebElement registerButton = driver.findElement(registerButtonby);
        registerButton.click();
    }
}
