package Tema8.Exercise8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageMain {
    public void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openUrl("https://example.com/login");
        loginPage.login(" Magda", "001122");

        driver.quit();
    }
}
