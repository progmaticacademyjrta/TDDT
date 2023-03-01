package hu.Progmatic.ParaBank.pages;

import hu.Progmatic.ParaBank.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MailIconPage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;

    By iconby = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a");

    By nameby = By.name("name");
    By mailby = By.name("email");
    By phoneby = By.name("phone");
    By messageby = By.name("message");
    By sentoButtonby = By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input");
    By successby = By.xpath("//*[@id=\"rightPanel\"]/p[1]");

    public MailIconPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void mailIcon() {

        WebElement iconClick = driver.findElement(iconby);
        iconClick.click();


        WebElement name = driver.findElement(nameby);
        name.sendKeys("XY");


        WebElement email = driver.findElement(mailby);
        email.sendKeys("valami@valami.com");


        WebElement phone = driver.findElement(phoneby);
        phone.sendKeys("+1 777 777");


        WebElement text = driver.findElement(messageby);
        text.sendKeys("Hello!");


        WebElement sendButton = driver.findElement(sentoButtonby);
        sendButton.click();


        WebElement success = driver.findElement(MailIconPage.this.successby);
        Assert.assertEquals(success.getText(), "Thank you XY");


    }
}
