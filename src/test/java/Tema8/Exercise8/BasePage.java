package Tema8.Exercise8;

//Exercițiul 8 –
//Automation context
//Creează: BasePage →
//protected WebDriver driver +constructor +
//metodă openUrl
//LoginPage extinde
//BasePage →
//metodă login(username, password)

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url) {
        driver.get(url);
        System.out.println("Opening URL: " + driver);
    }
}
