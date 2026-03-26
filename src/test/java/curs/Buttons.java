package curs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttons {

    @Test
    public void Buttons() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement clickMe = driver.findElement(By.xpath("//*[text()='Click Me']"));
        clickMe.click();

        WebElement outPut = driver.findElement(By.id("dynamicClickMessage"));

        boolean outPutMessage = driver.findElement(By.id("dynamicClickMessage")).isDisplayed();

        Assert.assertTrue(outPutMessage, "OutPutMessage is not displayed");

        String dynamicClickMsg = outPut.getText();

        Assert.assertEquals(dynamicClickMsg, "You have done a dynamic click", "Message is nor correct");


    }


}
