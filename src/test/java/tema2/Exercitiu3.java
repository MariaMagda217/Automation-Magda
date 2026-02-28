package tema2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercitiu3 {
    private final String urlString = "https://www.thefragranceshop.co.uk/";
    private final String urlApple = "https://www.apple.com/";

    @Test
    public void openWebsite() {
        WebDriver driver = new ChromeDriver();
        driver.get(urlString);
        driver.quit();
    }

    @Test
    public void openWebsiteApple() {
        WebDriver driver = new ChromeDriver();
        driver.get(urlApple);
        driver.quit();
    }
}
