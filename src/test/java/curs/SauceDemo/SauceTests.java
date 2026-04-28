package curs.SauceDemo;

import curs.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SauceTests {
    WebDriver driver;

    @Test
    public void sauceDemoTest() {
        driver.get("https://www.saucedemo.com");

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loginAs("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        System.out.println(("Pe pagina sunt " + inventoryPage.getProductsCount() + " produse"));

        List<WebElement> listaProduse = inventoryPage.getAllProducts();

        System.out.println("Lista de produse: ");
        for (WebElement produs : listaProduse) {
            System.out.println(produs.getText());
        }

        inventoryPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        inventoryPage.addProductToCart("Sauce Labs Onesie");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean isProductDisplayed = inventoryPage.isProductDisplayed("Sauce Labs Backpack");

        Assert.assertTrue(isProductDisplayed, "Produsul nu este afisat");
        homePage.clickLogoutBtn();
    }

    @Test
    public void sauceDemoTest2() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        HomePage home = loginPage.loginAs("standard_user", "secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickOnProduct("Sauce Labs Backpack");

        ProductPage productPage = new ProductPage(driver);
        String productName = productPage.getProductName();
        String productPrice = productPage.getProductPrice();

        Assert.assertEquals(productName, "Sauce Labs Backpack");
        Assert.assertEquals(productPrice, "$29.99");

        productPage.addToCart();
        home.goToCart();

        CartPage cartPage = new CartPage(driver);
        boolean isProductInCart = cartPage.isProductInCart("Sauce Lab Backpack");

        Assert.assertTrue(isProductInCart, "Produsul nu e in cos");
    }
}

