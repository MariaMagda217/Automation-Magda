package Tema9.Tests;

import Tema9.Pages.CartPage;
import Tema9.Pages.HomePage;
import Tema9.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addProduct {

    @Test
    public void addProductInCart() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openApp();
        homePage.clickOnProduct("Claw Hammer");

        String productName = productPage.getProductName().trim();

        productPage.addToCart();
        productPage.goToCart();

        String productInCart = cartPage.getProductNameFromCart().trim();
        Assert.assertEquals(productInCart, productName, "The item is not in cart");
        driver.quit();
    }
}

