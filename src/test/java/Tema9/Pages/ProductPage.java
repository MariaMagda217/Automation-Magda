package Tema9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public By productName = By.xpath("//h1[@data-test='product-name']");
    public By productPrice = By.xpath("//*[@data-test='unit-price']");
    public By productDescription = By.id("description");
    public By addToCartBtn = By.id("btn-add-to-cart");
    public By cartIcon = By.xpath("//*[@data-icon='cart-shopping']");
    public By navCart = By.xpath("//*[@data-test='nav-cart']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return getText(productName);
    }

    public String getProductDesc() {
        return getText(productDescription);
    }

    public double getProductPrice() {
        String price = getText(productPrice).replace("$", "");
        return Double.parseDouble(price);
    }

    public void addToCart() {
        click(addToCartBtn);
    }

    public void goToCart() {
        scrollToTop();
        clickToChild(navCart, cartIcon);
    }
}

