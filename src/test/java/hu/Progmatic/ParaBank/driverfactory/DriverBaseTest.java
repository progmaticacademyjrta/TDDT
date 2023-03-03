package hu.Progmatic.ParaBank.driverfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.*;
import java.time.Duration;


public class DriverBaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    By cleanBy = By.cssSelector("button[value='CLEAN']");
    By databaseBy = By.cssSelector("input[value='jdbc']");
    By submitBy = By.cssSelector("input[value='Submit']");
    protected String[] boundaryValues = new String[20];


    @BeforeMethod(alwaysRun = true)
    public void driverSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        Thread.sleep(1000);
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");


        WebElement dataBaseType = driver.findElement(databaseBy);
        dataBaseType.click();

        WebElement submitButton = driver.findElement(submitBy);
        submitButton.click();

        WebElement cleanButton = driver.findElement(cleanBy);
        cleanButton.click();

        actions = new Actions(driver);
        System.out.println("Test case execution started");
    }

    @AfterMethod(alwaysRun = true)
    public void driverCleanUp() {
        driver.quit();
        System.out.println("Test case execution finished");
    }

    public void getBoundaryValues() {
        String line = "";
        String splitBy = ";";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/requestLoanTestData.csv"));

            //returns a Boolean value
            while ((line = bufferedReader.readLine()) != null) {

                // use comma as separator
                boundaryValues = line.split(splitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}