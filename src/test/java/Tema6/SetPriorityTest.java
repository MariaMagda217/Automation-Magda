package Tema6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetPriorityTest {
    static final String WIKIPEDIA = "https://wikipedia.org";
    static final String THE_FRAGRANCE_SHOP = "https://www.thefragranceshop.co.uk/";
    static final String APPLE = "https://www.apple.com/uk/";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = -1)
    public void openWikipedia() {
        driver.get(WIKIPEDIA);
        String currentTitle = driver.getTitle();
        Assert.assertNotNull(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Wikipedia"),
                "The page is not opened!");
        System.out.println(currentTitle);
    }

    @Test(priority = 1)
    public void openFragranceShop() {
        driver.get(THE_FRAGRANCE_SHOP);
        String title = driver.getTitle();
        Assert.assertNotNull(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Fragrance"));
        System.out.println(title);
    }

    @Test(priority = 0)
    public void openApple() {
        driver.get(APPLE);
        String apple = driver.getTitle();
        Assert.assertNotNull(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Apple"));
        System.out.println(apple);
    }
}


