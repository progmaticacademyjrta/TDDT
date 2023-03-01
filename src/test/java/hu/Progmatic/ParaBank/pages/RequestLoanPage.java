package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RequestLoanPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By requestLoanBy = By.linkText("Request Loan");
    By loanAmountBy = By.id("amount");
    By downPaymentBy = By.id("downPayment");

    By applyNowBy = By.cssSelector("input[value='Apply Now']");
    By loanStatusBy = By.id("loanStatus");
    By logOutBy = By.linkText("Log Out");

    By errorBy = By.className("error");

    public RequestLoanPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void boundaryValue501() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/requestloan.htm");
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("501");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();

        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Approved");
        System.out.println("Loan Status: Approved (501,valid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }

    public void boundaryValue500() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/requestloan.htm");
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("500");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();

        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Approved");
        System.out.println("Loan Status: Approved (500,valid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }

    public void boundaryValue499() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("499");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();

        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Denied");
        System.out.println("Loan Status: Denied (499,valid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }

    public void boundaryValue999() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("999");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();

        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Approved");
        System.out.println("Loan Status: Approved (999,valid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }

    public void boundaryValue1000() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("1000");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();


        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Approved");
        System.out.println("Loan Status: Approved (1000,valid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }

    public void boundaryValue1001() throws InterruptedException {

        WebElement requestLoan = driver.findElement(requestLoanBy);
        requestLoan.click();
        System.out.println("Request Loan page appear");

        WebElement loanAmountInput = driver.findElement(loanAmountBy);
        loanAmountInput.sendKeys("1000");

        WebElement downPaymentInput = driver.findElement(downPaymentBy);
        downPaymentInput.sendKeys("1001");

        WebElement applyNowButton = driver.findElement(applyNowBy);
        applyNowButton.click();

        WebElement statusText = driver.findElement(loanStatusBy);

        Assert.assertEquals(statusText.getText(), "Denied");
        System.out.println("Loan Status: Denied (1001,Invalid)");

        WebElement logOut = driver.findElement(logOutBy);
        logOut.click();
        System.out.println("Log out successful");
    }
}
