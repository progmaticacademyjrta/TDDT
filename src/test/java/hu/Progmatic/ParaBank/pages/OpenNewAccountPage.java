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

    By openNEwAccountBy = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    By typeby = By.id("type");


    By successMessageby2 = By.className("title");
    By OpenNewAccountButtonby = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

    public OpenNewAccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void newAccountSavings() throws InterruptedException {


        WebElement openNEwAccount = driver.findElement(openNEwAccountBy);
        openNEwAccount.click();

        Select type = new Select(driver.findElement(typeby));
        type.selectByVisibleText("SAVINGS");

        WebElement clickOnAccountButton = driver.findElement(OpenNewAccountButtonby);
        clickOnAccountButton.click();
        Thread.sleep(1000);


        WebElement successMessage2 = driver.findElement(successMessageby2);
        Assert.assertEquals(successMessage2.getText(), "Account Opened!");
    }

    public void newAccountChecking() throws InterruptedException {


        WebElement openNEwAccount = driver.findElement(openNEwAccountBy);
        openNEwAccount.click();


        Select type = new Select(driver.findElement(typeby));
        type.selectByVisibleText("CHECKING");


        WebElement clickOnAccountButton = driver.findElement(OpenNewAccountButtonby);
        clickOnAccountButton.click();
        Thread.sleep(1000);


        WebElement successMessage2 = driver.findElement(successMessageby2);
        Assert.assertEquals(successMessage2.getText(), "Account Opened!");
    }
}
