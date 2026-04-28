package Tema9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public By cart = By.xpath("//button[@data-test='nav-cart']");
    public By cartProduct = By.className("product-title");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart() {
        click(cart);
    }

    public String getProductNameFromCart() {
        return getText(cartProduct);
    }
}