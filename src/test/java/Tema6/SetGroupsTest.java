package Tema6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.time.Duration;

public class SetGroupsTest {
    static final String WIKIPEDIA = "https://wikipedia.org";
    static final String APPLE = "https://www.apple.com/uk/";
    WebDriver driver;

    private void waitUntil() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeGroups("test_page")
    public void setupCorrectPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterGroups("test_page")
    public void tearDownCorrectPage() {
        driver.quit();
    }

    @Test(groups = "test_page")
    public void openWikipedia() {
        driver.get(WIKIPEDIA);
        Assert.assertNotNull(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Wikipedia"), "Wikipedia page did not open");
    }

    @Test(groups = "test_page")
    public void openApple() {
        driver.get(APPLE);
        Assert.assertNotNull(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Apple"), "Apple page din note open");
    }

    @BeforeGroups("english_joke")
    public void setupEnglishJoke() {
        System.out.println("Setup for english_joke");
    }

    @AfterGroups("english_joke")
    public void tearDownEnglishJoke() {
        System.out.println("Teardown for english_joke");
    }

    @Test(groups = "english_joke")
    public void englishDanceVerb() {
        String ID = "I dance";
        String YouD = "You dance";
        String HeD = "He dances";
        String punchLine = "But why, he dances better than me?";

        System.out.println(ID);
        System.out.println(YouD);
        System.out.println(HeD);
        System.out.println(punchLine);

        Assert.assertTrue(ID.endsWith("dance"));
        Assert.assertTrue(YouD.endsWith("dance"));
        Assert.assertTrue(HeD.endsWith("dances"));
        Assert.assertTrue(punchLine.contains("better than me"));
    }
}

