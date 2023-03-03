package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeIconPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By iconby = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a");
    By readMoreby = By.xpath("//*[@id=\"rightPanel\"]/p[1]/a");

    public HomeIconPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void homeIcon() {

        WebElement iconClick = driver.findElement(iconby);
        iconClick.click();


        WebElement readMore = driver.findElement(readMoreby);
        readMore.click();

    }
}
