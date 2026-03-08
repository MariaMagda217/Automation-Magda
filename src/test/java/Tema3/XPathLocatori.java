package Tema3;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class XPathLocatori {


    @Test
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Actions actions = new Actions(driver);

        // First Name;

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Test");

        //Last Name

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("User");

        //Email

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("test@email.com");


        //Gender

        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        gender.click();

        //PhoneNr

        WebElement phoneNr = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phoneNr.sendKeys("0742415670");

        //TextSubject

        WebElement subjects = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjects.sendKeys("Maths");
        subjects.sendKeys(Keys.ENTER);

        //Current Address

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("High Street, Leighton Buzzard");

        //Submit

        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
        Object JavascriptExecutor;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);

        //PopUp

        //  WebElement popup = driver.findElement(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']"));
        //  WebElement close = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
        // close.click();

    }
}

