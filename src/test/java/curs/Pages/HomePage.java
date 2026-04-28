package curs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By menuBtn = By.xpath("//button[text() = 'Open Menu']");
    By cartBtn = By.xpath("//a[@data-test = 'shopping-cart-link']");
    By logoutBtn = By.xpath("//a[@data-test = 'logout-sidebar-link']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutBtn() {
        driver.findElement(this.menuBtn).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(this.logoutBtn).click();
    }

    public void goToCart() {
        driver.findElement(cartBtn).click();
    }
}
