package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement waitForVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> waitForProducts(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }

    ///  Example
    public void mySuperTest() {
        //Given
        String username = "asdasd";
        String password = "ytttt";

        // When
        WebElement userElemant = driver.findElement(By.id("data=username"));
        WebElement submit = driver.findElement(By.id("data=username"));

        // and optional
        userElemant.isDisplayed();
        boolean submitIsDisplayerd = submit.isDisplayed();
        // Then
        userElemant.sendKeys(username);


        //ASertiune sau verificare
        Assert.assertTrue(submitIsDisplayerd, "NU este afisat mai incearca");
    }
}

