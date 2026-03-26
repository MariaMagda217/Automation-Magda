package curs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Interact {
    WebDriver driver;

    @Test

    public void Interaction2() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement selectDropdownLocator = driver.findElement(By.id("oldSelectMenu"));
        Select dropdown = new Select(selectDropdownLocator);

        dropdown.selectByVisibleText("Blue");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        dropdown.selectByValue("3");

        //      try {
        //       Thread.sleep(5000);
        //   } catch (InterruptedException e) {
        //          throw new RuntimeException(e);
        //      }
        //   dropdown.selectByIndex(4);

        //    String selectedOptionText = dropdown.getFirstSelectedOption().getText();
        //   Assert.assertEquals(selectedOptionText,"Purple","Optiunea selectata nu e Purple");
    }

    @Test

    public void dropdownNew() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement dropDown = driver.findElement(By.className("css-13cymwt-control"));

        dropDown.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement option1 = driver.findElement(By.id("react-select-2-option-0-0"));
        option1.click();
    }

    @Test
    public void testCheckBox() {

        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();


        WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(), 'MightyCraft Hardware')]/input"));
        checkbox.click();

        checkbox.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox, false));

        boolean ischeckboxSelected = checkbox.isSelected();

        if (ischeckboxSelected) {
            System.out.println("este selectat , nu mai trebuie click");
        } else {
            System.out.println("nu este selectat, da click");
            checkbox.click();
        }
        ischeckboxSelected = checkbox.isSelected();

        Assert.assertTrue("nu este selectat", ischeckboxSelected);
    }

    @Test
    public void testRadioButton() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

        WebElement impressiveRadioButton = driver.findElement(By.id("impressiveRadio"));

        yesRadioButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        impressiveRadioButton.click();
    }
}





