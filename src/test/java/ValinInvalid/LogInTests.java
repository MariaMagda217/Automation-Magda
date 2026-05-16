package ValinInvalid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInTests {

    static WebDriver driver;

    @Test

    public static void main() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        LogInPage login = new LogInPage();
        login.valid();
    }
}
