package Tema3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCreat {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);

        driver.findElement(By.id("firstName")).sendKeys("Magda");
        driver.findElement(By.id("lastName")).sendKeys("Boboc");
        driver.findElement(By.id("userEmail")).sendKeys("mariaa.magda@yahoo.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("4000");
        driver.findElement(By.id("department")).sendKeys("QA");
        driver.findElement(By.id("submit")).click();

    }
}
