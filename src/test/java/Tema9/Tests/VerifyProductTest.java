package Tema9.Tests;

import Tema9.Pages.HomePage;
import Tema9.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyProductTest {
    @Test
    public void verifyProductDetails() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        home.openApp();
        home.clickOnProduct("Claw Hammer");

        Assert.assertFalse(product.getProductName().isEmpty());
        Assert.assertTrue(product.getProductPrice() > 0);

        driver.quit();
    }
}
