package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BillPayPage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;

    By billPayby = By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a");
    By payeeNameBy = By.name("payee.name");
    By addressby = By.name("payee.address.street");
    By cityby = By.name("payee.address.city");
    By stateby = By.name("payee.address.state");
    By zipby = By.name("payee.address.zipCode");
    By phoneby = By.name("payee.phoneNumber");
    By accountby = By.name("payee.accountNumber");
    By verifyaccountby = By.name("verifyAccount");
    By amountby = By.name("amount");
    By sendpaymentby = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input");
    By succesmessageby = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/h1");

    public BillPayPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void billPay() throws InterruptedException {
        WebElement billPayButton = driver.findElement(billPayby);
        billPayButton.click();

        WebElement payeeName = driver.findElement(payeeNameBy);
        payeeName.sendKeys("XY");

        WebElement address = driver.findElement(addressby);
        address.sendKeys("Dream bvl.");

        WebElement city = driver.findElement(cityby);
        city.sendKeys("Hope");

        WebElement state = driver.findElement(stateby);
        state.sendKeys("Montana");

        WebElement zipCode = driver.findElement(zipby);
        zipCode.sendKeys("5555");

        WebElement phone = driver.findElement(phoneby);
        phone.sendKeys("+1 777 777");

        WebElement account = driver.findElement(accountby);
        account.sendKeys("3465");

        WebElement verifyAccount = driver.findElement(verifyaccountby);
        verifyAccount.sendKeys("3465");

        WebElement amount = driver.findElement(amountby);
        amount.sendKeys("1000");

        WebElement sendPaymentButton = driver.findElement(sendpaymentby);
        sendPaymentButton.click();

        Thread.sleep(1000);
        WebElement succesMessage = driver.findElement(succesmessageby);
        Assert.assertEquals(succesMessage.getText(), "Bill Payment Complete");
    }
}
