package curs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQA2 {

    @Test
    public void textBoxTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitById = driver.findElement(By.id("submit"));
        WebElement submit = driver.findElement(By.className("btn-primary"));


        fullName.sendKeys("Magda");
        email.sendKeys("mariaa.magdaa@yahoo.com");
        currentAddress.sendKeys("Uk");
        permanentAddress.sendKeys("Uk");

        submit.click();

        WebElement output = driver.findElement(By.id("output"));

        Assert.assertTrue(output.isDisplayed());

    }

    @Test
    public void textBoxTestNegative() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitById = driver.findElement(By.id("submit"));
        WebElement submit = driver.findElement(By.className("btn-primary"));


        fullName.sendKeys("Magda");
        email.sendKeys("mariaa.magdaa");
        currentAddress.sendKeys("Uk");
        permanentAddress.sendKeys("Uk");

        submit.click();


        String classAttribute = email.getAttribute("class");
        System.out.println(classAttribute);
        Assert.assertTrue(classAttribute.contains("field-error"));


    }
}



