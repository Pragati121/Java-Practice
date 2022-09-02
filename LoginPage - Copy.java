package Pages;
import Test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage{
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By Search= By.id("navigation-dummySearch");
    By Unique= By.xpath(//);
    public void login()throws InterruptedException
    {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(Search).click();

    }

}