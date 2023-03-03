package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DemoIconPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By iconby = By.className("aboutus");
    By messageby = By.className("title");

    public DemoIconPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void demoIcon() {


        WebElement iconClick = driver.findElement(iconby);
        iconClick.click();


        WebElement message = driver.findElement(messageby);
        Assert.assertEquals(message.getText(), "ParaSoft Demo Website");


    }
}
