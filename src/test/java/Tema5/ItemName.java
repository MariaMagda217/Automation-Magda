package Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ItemName {

//    Folosind pagina https://practicesoftwaretesting.com/
//            •	Accesează o categorie de produse.
//	•1.	Folosește filtrele disponibile.
//	•	Selectează un filtru (ex: brand).
//            •	Verifică faptul că cel puțin două produse conțin numele categoriei selectate.
//	•2.	Folosind pagina https://practicesoftwaretesting.com/
//            •	Deschide un produs.
//	•	Apasă Add to cart.
//            •	Deschide coșul.
//            •	Verificare:
//            •	produsul apare în coș
//	•	cantitatea este 1.
//     3.       •	Test Case:
//            •	Accesează site-ul.
//	•	Caută produsul Hammer.
//	•	Deschide produsul.
//            •	Adaugă produsul în coș.
//            •	Deschide coșul.
//            •	Verifică:
//            •	produsul este în coș
//	•	cantitatea este 1
//            •	prețul este afișat.

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    private void waitUntil(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }

    @Test
    public void verifyAtLeastTwoItemsExistInList() {
        waitUntil("//*[starts-with(@data-test, 'category-')]");

        List<WebElement> checkboxElements = driver.findElements(By.xpath("//*[starts-with(@data-test, 'category-')]"));
        WebElement screwdriverElement = checkboxElements.get(4);
        screwdriverElement.click();

        waitUntil("//*[@data-test='filter_completed']");

        WebElement filterCompletedElement = driver.findElement(By.xpath("//*[@data-test='filter_completed']"));
        List<WebElement> screwdriverElements = filterCompletedElement.findElements(By.xpath("//*[starts-with(@data-test, 'product-')]"));

        int count = 0;

        for (WebElement element : screwdriverElements) {
            WebElement titleElement = element.findElement(By.xpath("//*[@data-test='product-name']"));
            String title = titleElement.getText();

            if (title.toLowerCase().contains("screwdriver")) {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        Assert.assertTrue(count >= 2, "Expected at least 2 screwdriver products, but found: " + count);
    }

    @Test
    public void verifyAddToCartAndQty() {

        waitUntil("//*[@data-test='product-name']");

        WebElement productElement = driver.findElement(By.xpath("//*[@data-test='product-name']"));
        productElement.click();

        waitUntil("//*[@data-test='add-to-cart']");

        WebElement addToCartElement = driver.findElement(By.xpath("//*[@data-test='add-to-cart']"));
        addToCartElement.click();

        waitUntil("//*[@data-test='nav-cart']");

        WebElement cartElement = driver.findElement(By.xpath("//*[@data-test='nav-cart']"));
        cartElement.click();

        waitUntil("//*[@data-test='product-title']");

        List<WebElement> itemElements = driver.findElements(By.xpath("//*[@data-test='product-title']"));
        Assert.assertEquals(itemElements.size(), 1);

        waitUntil("//*[@data-test='product-quantity']");

        WebElement itemQty = driver.findElement(By.xpath("//*[@data-test='product-quantity']"));
        Assert.assertEquals(itemQty.getAttribute("value"), "1", "Quantity is not 1");
    }

    @Test
    public void verifyHammerAddAndQty() {

        WebElement searchBarElement = driver.findElement(By.id("search-query"));
        searchBarElement.sendKeys("hammer");
        WebElement searchBtnElement = driver.findElement(
                By.xpath("//button[contains(@class, 'btn') and contains(@class, 'btn-secondary')]"));
        searchBtnElement.click();

        waitUntil("//*[@data-test='product-name']");

        List<WebElement> hammer = driver.findElements(By.xpath("//*[@data-test='product-name' and contains(text(), 'Hammer')]"));
        Assert.assertTrue(hammer.size() >= 2, "No more than 2 Hammer items");
        hammer.get(1).click();

        waitUntil("//*[@data-test='add-to-cart']");

        WebElement addToCartElement = driver.findElement(By.xpath("//*[@data-test='add-to-cart']"));
        addToCartElement.click();

        waitUntil("//*[@data-test='nav-cart']");

        WebElement cartElement = driver.findElement(By.xpath("//*[@data-test='nav-cart']"));
        cartElement.click();

        waitUntil("//*[@data-test='product-title']");

        List<WebElement> itemElements = driver.findElements(By.xpath("//*[@data-test='product-title']"));
        Assert.assertEquals(itemElements.size(), 1);

        waitUntil("//*[@data-test='product-quantity']");

        WebElement itemQty = driver.findElement(By.xpath("//*[@data-test='product-quantity']"));
        Assert.assertEquals(itemQty.getAttribute("value"), "1", "Quantity is not 1");

        WebElement price = driver.findElement(By.xpath("//*[@data-test='product-price']"));
        String priceTxt = price.getText();
        priceTxt = priceTxt.replace("$", "");
        System.out.println(priceTxt);
        double priceItem = Double.parseDouble(priceTxt);
        System.out.println("Price: " + priceItem);
        Assert.assertFalse(priceTxt.isEmpty(), "The price is not displayed");

    }
}
