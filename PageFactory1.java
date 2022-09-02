package Pages;
import org.openqa.selenium.WebDriver;
public class PageFactory1 {
    WebDriver driver;
    private LoginPage1 loginPage1;

    public PageFactory1(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage1 GetLoginPage() {
        if (loginPage1 == null) {
            loginPage1 = new LoginPage1(driver);
        }
        return loginPage1;
    }

    }

