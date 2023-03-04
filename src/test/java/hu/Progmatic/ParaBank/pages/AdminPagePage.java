package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdminPagePage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;

    By initBalanceBy = By.id("initialBalance");
    By minimumBalanceBy = By.id("minimumBalance");
    By localProcessorBy = By.id("loanProcessor");
    By tresholdBy = By.id("loanProcessorThreshold");
    By submitBy = By.cssSelector("input[value='Submit']");
    By cleanby = By.cssSelector("button[value='CLEAN']");


    public AdminPagePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void downPayment() {
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

    }

    public void availableFunds() {
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

    }

    public void combined() {
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

    }

}
