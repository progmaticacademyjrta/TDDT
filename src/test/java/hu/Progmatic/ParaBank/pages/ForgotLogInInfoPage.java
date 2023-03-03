package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ForgotLogInInfoPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By forgotby = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");
    By firstNameby = By.name("firstName");
    By lastNameby = By.name("lastName");
    By addressby = By.name("address.street");
    By cityby = By.name("address.city");
    By stateby = By.name("address.state");
    By zipby = By.name("address.zipCode");
    //Mindig a Lastname-t tölti ki valamiért, csak full xpathal működik
    By ssnby = By.name("ssn");
    By findby = By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input");
    By messageby = By.className("title");

    public ForgotLogInInfoPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void forgotLogIn() throws InterruptedException {


        WebElement forgotLogInButton = driver.findElement(forgotby);
        forgotLogInButton.click();


        WebElement firstName = driver.findElement(firstNameby);
        firstName.sendKeys("XY");


        WebElement lastName = driver.findElement(lastNameby);
        lastName.sendKeys("YX");


        WebElement address = driver.findElement(addressby);
        address.sendKeys("Dream bvld");


        WebElement city = driver.findElement(cityby);
        city.sendKeys("Hope");


        WebElement state = driver.findElement(stateby);
        state.sendKeys("Montana");
        //Thread.sleep(1000);

        WebElement zipCode = driver.findElement(zipby);
        zipCode.sendKeys("77777");

        //Thread.sleep(1000);

        WebElement ssn = driver.findElement(ssnby);
        ssn.sendKeys("asd");

        //Thread.sleep(2000);

        WebElement findMyInfo = driver.findElement(findby);
        findMyInfo.click();

        //Thread.sleep(1000);


        WebElement message = driver.findElement(messageby);
        Assert.assertEquals(message.getText(), "Customer Lookup");
    }
}
///html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input
///html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input

////*[@id="lastName"]
////*[@id="ssn"]