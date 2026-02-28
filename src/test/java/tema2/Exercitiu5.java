package tema2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercitiu5 {
    WebDriver driver;
    private final String urlString = "https://www.thefragranceshop.co.uk/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void titleNotNull() {
        driver.get(urlString);
        String title = driver.getTitle();
        Assert.assertNotNull(title);
    }

    @Test
    public void containsTitle() {
        driver.get(urlString);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Fragrances"));
    }
}
