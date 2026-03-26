package curs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SortProduct {
    //  Folosind pagina https://practicesoftwaretesting.com/
    //  a. Navighează la lista de produse.
    //  b. Identifică dropdown-ul Sort.
    //  c. Selectează opțiunea Price (High → Low).
    //  d. Verifică că primul produs are prețul mai mare decât produsul următor.

    WebDriver driver;

    @Test
    public void sortProductByPrice() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        WebElement sortDropDown = driver.findElement(By.xpath("//select[@data-test='sort']"));

        Select select = new Select(sortDropDown);
        select.selectByValue("price,desc");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h5[@class='card-title'])[1]"), "Drawer Tool Cabinet"));
        WebElement firstProductPrice = driver.findElement(By.xpath("(//span[@data-test='product-price'])[1]"));
        WebElement secondProductPrice = driver.findElement(By.xpath("(//span[@data-test='product-price'])[2]"));

        String firstProductPriceText = firstProductPrice.getText();
        String secondProductPriceText = secondProductPrice.getText();

        System.out.println(firstProductPriceText);
        System.out.println(secondProductPriceText);

        firstProductPriceText = firstProductPriceText.replace("$", "");
        secondProductPriceText = secondProductPriceText.replace("$", "");

        System.out.println(firstProductPriceText);
        System.out.println(secondProductPriceText);

        double firstPrice = Double.parseDouble(firstProductPriceText);
        double secondPrice = Double.parseDouble(secondProductPriceText);

        System.out.println(firstPrice);
        System.out.println(secondPrice);

        Assert.assertTrue(firstPrice > secondPrice, "Primul pret nu este mai mare decat al doilea.");

    }
}
