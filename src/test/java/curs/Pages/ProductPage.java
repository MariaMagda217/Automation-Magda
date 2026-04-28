package curs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final WebDriver driver;

    private final By name = By.className("inventory_details_name");
    private final By price = By.className("inventory_details_price");
    private final By addToCartBtn = By.xpath("//button[@data-test='add-to-cart']");
    private final By cartBtn = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(name).getText();
    }

    public String getProductPrice() {
        return driver.findElement(price).getText();
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }
}
