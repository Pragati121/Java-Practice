package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage1 {
    WebDriver driver;
    public LoginPage1(WebDriver driver) {
        this.driver = driver;
    }

    By Search= By.id("navigation-dummySearch");
    By Unique= By.id("id=SC_Level_1_1_menu");
    public void login()throws InterruptedException
    {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(Search).click();
        driver.findElement(Unique).click();

    }

}