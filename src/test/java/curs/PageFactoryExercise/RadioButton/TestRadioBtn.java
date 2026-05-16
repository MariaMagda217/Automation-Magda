package curs.PageFactoryExercise.RadioButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRadioBtn {

    WebDriver driver;
    RadioBtn radioBtn;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        radioBtn = new RadioBtn(driver);
    }

    @Test
    public void testSelectYes() {
        radioBtn.selectYes();
        Assert.assertTrue(radioBtn.isYesSelected(), "Yes radio button should be selected");
    }

    @Test
    public void testSelectImpressive() {
        radioBtn.selectImpressive();
        Assert.assertTrue(radioBtn.isImpressiveSelected(), "Impressive radio button should be selected");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}