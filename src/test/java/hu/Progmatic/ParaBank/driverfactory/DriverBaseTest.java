package hu.Progmatic.ParaBank.driverfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverBaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    By cleanby = By.cssSelector("button[value='CLEAN']");

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        WebElement cleanButton = driver.findElement(cleanby);
        cleanButton.click();

        actions = new Actions(driver);
        System.out.println("Test case execution started");
    }

    @AfterMethod(alwaysRun = true)
    public void driverCleanUp() {
        driver.quit();
        System.out.println("Test case execution finished");
    }
}
