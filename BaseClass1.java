package Test;
import Pages.PageFactory1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
    static WebDriver driver;
    static PageFactory1 getPageFactory1;
    static void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.marksandspencer.com");
        getPageFactory1 = new PageFactory1(driver);
    }
}