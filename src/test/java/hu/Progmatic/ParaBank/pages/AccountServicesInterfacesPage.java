package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AccountServicesInterfacesPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;
    By openNewAccountBy = By.linkText("Open New Account");
    By accountsOverviewBy = By.linkText("Accounts Overview");
    By transferFundsBy = By.linkText("Transfer Funds");
    By billPayBy = By.linkText("Bill Pay");
    By findTransactionBy = By.linkText("Find Transactions");
    By updateContactInfoBy = By.linkText("Update Contact Info");
    By requestLoanBy = By.linkText("Request Loan");
    By logOutBy = By.linkText("Log Out");


    public AccountServicesInterfacesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void interfacesCheck() {
        WebElement openNewAccount = driver.findElement(openNewAccountBy);
        openNewAccount.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/openaccount.htm");
        System.out.println("Open New Account page appear");

        WebElement accountsOverview = driver.findElement(accountsOverviewBy);
        accountsOverview.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/overview.htm");
        System.out.println("Accounts Overview page appear");

        WebElement transferFunds = driver.findElement(transferFundsBy);
        transferFunds.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/transfer.htm");
        System.out.println("Transfer Funds page appear");

        WebElement billPay = driver.findElement(billPayBy);
        billPay.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/billpay.htm");
        System.out.println("Bill Pay page appear");

        WebElement findTransaction = driver.findElement(findTransactionBy);
        findTransaction.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/findtrans.htm");
        System.out.println("Find Transaction page appear");

        WebElement updateContactInfo = driver.findElement(updateContactInfoBy);
        updateContactInfo.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/updateprofile.htm");
        System.out.println("Find Transaction page appear");

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/requestloan.htm");
        System.out.println("Request Loan page appear");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        System.out.println("Log out successful");


    }
}
