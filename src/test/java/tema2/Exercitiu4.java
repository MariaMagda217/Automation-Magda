package tema2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercitiu4 {
    private final String urlString = "https://www.thefragranceshop.co.uk/";
    private final String urlApple = "https://www.apple.com/";
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void openWebsite() {
        driver.get(urlString);
    }

    @Test
    public void openWebsiteApple() {
        driver.get(urlApple);
    }
}
