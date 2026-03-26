package curs;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interact2 {
    WebDriver driver;

    @Test
    public void testUpload() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");

        WebElement uploadInput = driver.findElement(By.id("uploadFile"));
        uploadInput.sendKeys("/Users/bobocmariamagdalena/Desktop/Text.txt");
    }

    @Test
    public void testButtons() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Actions actiuni = new Actions(driver);
        actiuni.doubleClick(doubleClickBtn).perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actiuni.contextClick(rightClickBtn).perform();
    }

}
