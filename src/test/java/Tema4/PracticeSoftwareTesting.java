package Tema4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PracticeSoftwareTesting {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void assertTitleIsDisplayed() {
        String title = driver.getTitle();
        Assert.assertNotNull(title);
    }

    @Test
    public void assertLogoIsDisplayed() {
        WebElement logoElement = driver.findElement(By.id("Layer_1"));
        boolean isDisplayed = logoElement.isDisplayed();
        Assert.assertTrue(isDisplayed, "Logo element is not displayed");
    }

    @Test
    public void assertItemIsDisplayed() {
        WebElement searchBarElement = driver.findElement(By.id("search-query"));
        searchBarElement.sendKeys("hammer");
        WebElement searchButtonElement = driver.findElement(
                By.xpath("//button[contains(@class, 'btn') and contains(@class, 'btn-secondary')]")
        );
        searchButtonElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-test='search_completed']")));

        boolean isEmpty = driver.findElements(By.xpath("//*[starts-with(@data-test, 'product-')]")).isEmpty();

        Assert.assertFalse(isEmpty, "Item is not empty");
    }

    @Test
    public void assertOpenItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstItem = driver.findElements(
                By.xpath("//*[starts-with(@data-test, 'product-')]")
        ).getFirst();
        firstItem.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn-add-to-cart")));

        WebElement itemImage = driver.findElement(
                By.xpath("//img[contains(@class, 'figure-img') and contains(@class, 'img-fluid')]")
        );
        Assert.assertTrue(itemImage.isDisplayed(), "Image doesn't exists");

        WebElement addToCartElement = driver.findElement(By.id("btn-add-to-cart"));
        Assert.assertTrue(addToCartElement.isDisplayed(), "Button doesn't exists");

    }

    @Test
    public void assertFilters() {
        List<WebElement> filtersElements = driver.findElements(By.xpath("//*[starts-with(@data-test, 'category-')]"));
        WebElement firsFilter = filtersElements.getFirst();

        Actions actions = new Actions(driver);
        actions.moveToElement(firsFilter).perform();

        List<WebElement> checkboxElements = driver.findElements(By.xpath("//*[starts-with(@data-test, 'category-')]"));
        WebElement firstCheckboxElement = checkboxElements.get(1);

        firstCheckboxElement.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-test='filter_completed']")));

        WebElement filterCompletedElement = driver.findElement(By.xpath("//*[@data-test='filter_completed']"));

        List<WebElement> hammerElements = filterCompletedElement.findElements(By.xpath("//*[starts-with(@data-test, 'product-')]"));

        for (WebElement element : hammerElements) {
            WebElement titleElement = element.findElement(By.xpath("//*[@data-test='product-name']"));
            String title = titleElement.getText();

            Assert.assertTrue(title.toLowerCase().contains("hammer"), "Title doesn't contains hammer");
        }
    }
}
