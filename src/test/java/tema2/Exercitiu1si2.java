package tema2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercitiu1si2 {
    private final String urlString = "https://www.thefragranceshop.co.uk/";

    @Test
    public void openWebSite() {
        WebDriver driver = new ChromeDriver();
        driver.get(urlString);
        driver.quit();
    }

    @Test
    public void verificareTitlu() {
        WebDriver driver = new ChromeDriver();
        driver.get(urlString);

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Shop Fragrances"));
        driver.quit();
    }
}
