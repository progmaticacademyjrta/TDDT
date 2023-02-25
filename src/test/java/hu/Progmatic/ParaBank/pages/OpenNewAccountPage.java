package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class OpenNewAccountPage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;
    By newAccountby = By.xpath("//*[@id=\"type\"]");
    By typeby = By.className("input ng-pristine ng-valid ng-not-empty ng-touched");
    By clickonby = By.className("input ng-pristine ng-valid ng-not-empty ng-touched");
    

    public OpenNewAccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void openNewAccount (){
        WebElement newAccountButton = driver.findElement(newAccountby);
        newAccountButton.click();
        Select type = new Select(driver.findElement(typeby);
        

        WebElement clickOnNewButton = driver.findElement(clickonby);
    }
}
