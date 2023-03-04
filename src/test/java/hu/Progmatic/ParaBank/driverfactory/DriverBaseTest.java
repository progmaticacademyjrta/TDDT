package hu.Progmatic.ParaBank.driverfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
    By soapEndpointBy = By.id("soapEndpoint");
    By restEndpointBy = By.id("restEndpoint");
    By endpointBy = By.id("endpoint");

    protected String[] boundaryValues = new String[20];


    @BeforeMethod(alwaysRun = true)
    public void driverSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

        Thread.sleep(1000);
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        if (driver.getPageSource().contains("Running")) {

            Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Running']")).isDisplayed());
            System.out.println("Server is Running");

        } else {
            driver.findElement(By.cssSelector("input[value='Startup']")).click();
            System.out.println("Server changed to Running");
        }

        WebElement dataBaseType = driver.findElement(databaseBy);
        dataBaseType.click();

        WebElement soapEndpoint = driver.findElement(soapEndpointBy);
        soapEndpoint.clear();

        WebElement restEndpoint = driver.findElement(restEndpointBy);
        restEndpoint.clear();

        WebElement endPoint = driver.findElement(endpointBy);
        endPoint.clear();

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
            //BufferedReader segítségével .csv fájl beolvasása
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/requestLoanTestData.csv"));

            //Amennyiben a sorban már nincs érték (sor végére ér) a beolvasási ciklus befejeződik
            while ((line = bufferedReader.readLine()) != null) {

                // Pontosvesszőként feldarabolja a beolvasott fájl értékeit és elmenti String tömb indexeire
                boundaryValues = line.split(splitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}