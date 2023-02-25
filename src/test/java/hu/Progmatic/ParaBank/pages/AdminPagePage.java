package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPagePage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;
    By cleanby = By.cssSelector("button[value='CLEAN']");
    By initBalanceBy = By.id("initialBalance");
    By minimumBalanceBy = By.id("minimumBalance");

    By localProcessorBy = By.id("loanProcessor");

    By tresholdBy = By.id("loanProcessorThreshold");

    By submitBy = By.cssSelector("input[value='Submit']");



    public AdminPagePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clean(){
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();
    }

    public void downPayment() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        WebElement initBalanceInput = driver.findElement(initBalanceBy);
        initBalanceInput.clear();
        initBalanceInput.sendKeys("1000");

        WebElement minimumBalanceInput = driver.findElement(minimumBalanceBy);
        minimumBalanceInput.clear();
        minimumBalanceInput.sendKeys("1000");

        Select localProcessor = new Select(driver.findElement(localProcessorBy));
        localProcessor.selectByValue("down");

        WebElement tresholdInput = driver.findElement(tresholdBy);
        tresholdInput.clear();
        tresholdInput.sendKeys("50");

        WebElement submitButton = driver.findElement(submitBy);
        submitButton.click();

        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();


        WebElement status = driver.findElement(By.xpath("//*[text()='Running']"));
        Assert.assertTrue(status.isDisplayed());
        System.out.println("Down payment loan processor server is running");
    }
    public void availableFunds() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        WebElement initBalanceInput = driver.findElement(initBalanceBy);
        initBalanceInput.clear();
        initBalanceInput.sendKeys("1000");

        WebElement minimumBalanceInput = driver.findElement(minimumBalanceBy);
        minimumBalanceInput.clear();
        minimumBalanceInput.sendKeys("1000");

        Select localProcessor = new Select(driver.findElement(localProcessorBy));
        localProcessor.selectByValue("funds");

        WebElement tresholdInput = driver.findElement(tresholdBy);
        tresholdInput.clear();
        tresholdInput.sendKeys("50");

        WebElement submitButton = driver.findElement(submitBy);
        submitButton.click();

        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();


        WebElement status = driver.findElement(By.xpath("//*[text()='Running']"));
        Assert.assertTrue(status.isDisplayed());
        System.out.println("Available loan processor server is running");
    }

    public void combined() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        WebElement initBalanceInput = driver.findElement(initBalanceBy);
        initBalanceInput.clear();
        initBalanceInput.sendKeys("1000");

        WebElement minimumBalanceInput = driver.findElement(minimumBalanceBy);
        minimumBalanceInput.clear();
        minimumBalanceInput.sendKeys("1000");

        Select localProcessor = new Select(driver.findElement(localProcessorBy));
        localProcessor.selectByValue("combined");

        WebElement tresholdInput = driver.findElement(tresholdBy);
        tresholdInput.clear();
        tresholdInput.sendKeys("50");

        WebElement submitButton = driver.findElement(submitBy);
        submitButton.click();

        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();

        WebElement status = driver.findElement(By.xpath("//*[text()='Running']"));
        Assert.assertTrue(status.isDisplayed());
        System.out.println("Combined loan processor server is running");
    }
}
