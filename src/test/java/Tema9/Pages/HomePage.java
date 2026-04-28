package Tema9.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openApp() {
        driver.get("https://practicesoftwaretesting.com/");
    }

    public void clickOnProduct(String productName) {
        String xpath = "//h5[contains(text(),'" + productName + "')]";
        click(By.xpath(xpath));
    }
}


