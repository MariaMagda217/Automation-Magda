package curs;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ExerciseInteract {

    WebDriver driver;

    @Test

    public void selectMenu() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);
        select.selectByValue("1");

        String selectedOptionText = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText, "Blue", "The value selected is not Blue.");

        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions actiuni = new Actions(driver);
        actiuni.doubleClick(doubleClickBtn).perform();

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actiuni.contextClick(rightClickBtn).perform();


        String doubleClickMsg = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals(doubleClickMsg, "You have done a double click");

        String rightClickMsg = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(rightClickMsg, "You have done a right click");
    }
}
