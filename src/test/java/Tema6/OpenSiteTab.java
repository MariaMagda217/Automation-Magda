package Tema6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//Creează un test care:
// •deschide un site
//•deschide un tab nou (WindowType.TAB)
//•accesează alt site în noul tab
//•Afișează titlul ambelor taburi

public class OpenSiteTab {
    static final String DEMOQA = "https://demoqa.com/";
    static final String PRACTICE_SOFTWARE_TESTING = "https://practicesoftwaretesting.com/";
    WebDriver driver;

    private void waitUntil(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @BeforeGroups("correct_page")
    public void setupCorrectPage() {
        setUp();
    }

    @AfterGroups("correct_page")
    public void tearDownCorrectPage() {
        tearDown();
    }

    @Test
    public void verifyTitle() {
        driver.get(DEMOQA);
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(PRACTICE_SOFTWARE_TESTING);
        System.out.println(driver.getTitle());
    }
//•Creează un test care:
//•deschide 2 taburi
//•salvează windowHandles
//•navighează între ele
//•Verifică titlul fiecărui tab folosind Assert

    @Test
    public void verifyTabsTitles() {
        driver.get(DEMOQA);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(PRACTICE_SOFTWARE_TESTING);

        //Set<String> allTabs = driver.getWindowHandles();
        List<String> allTabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(allTabs.getFirst());
        String demoqaTitle = driver.getTitle();

        driver.switchTo().window(allTabs.get(1));
        String practiceTitle = driver.getTitle();

        Assert.assertEquals(demoqaTitle, "demosite");
        Assert.assertEquals(practiceTitle, "Practice Software Testing - Toolshop - v5.0");
    }

    @Test(groups = {"correct_page"})
    public void correctPage() {
        driver.get(DEMOQA);
        String originalTab = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(PRACTICE_SOFTWARE_TESTING);
        driver.close();
        driver.switchTo().window(originalTab);
        Assert.assertEquals(driver.getCurrentUrl(), DEMOQA);
    }

    // • Creează un test care:
// •Deschide https://practicesoftwaretesting.com/
// •Navighează pe o categorie
// •Deschide produsul într-un tab nou
// •Revine în tabul principal
// •Face refresh
// •Adauga:
// •@BeforeMethod
// •@AfterMethod
// •Assert
// •Ruleaza testul folosind un fisier .xml
    @BeforeGroups("open_item_new_tab")
    public void setupOpenItem() {
        setUp();
    }

    @AfterGroups("open_item_new_tab")
    public void tearDownOpenItemNewTab() {
        tearDown();
    }

    @Test(groups = {"open_item_new_tab"})
    public void openItemNewTab() {
        driver.get(PRACTICE_SOFTWARE_TESTING);
        String originalTab = driver.getWindowHandle();

        List<WebElement> filtersElements = driver.findElements(By.xpath("//*[starts-with(@data-test, 'category-')]"));
        WebElement firstFilter = filtersElements.getFirst();

        Actions actions = new Actions(driver);
        actions.moveToElement(firstFilter).perform();

        List<WebElement> checkboxElements = driver.findElements(By.xpath("//*[starts-with(@data-test, 'category-')]"));
        WebElement firstCheckboxElement = checkboxElements.get(1);

        firstCheckboxElement.click();

        waitUntil("//*[@data-test='filter_completed']");

        WebElement firstItem = driver.findElements(
                By.xpath("//*[starts-with(@data-test, 'product-')]")).getFirst();

        actions.keyDown(Keys.COMMAND).click(firstItem).keyUp(Keys.COMMAND).build().perform();

        List<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(1));

        String productTabUrl = driver.getCurrentUrl();

        driver.switchTo().window(originalTab);
        driver.navigate().refresh();

        Assert.assertNotNull(productTabUrl);
        Assert.assertTrue(productTabUrl.contains("product"));
    }
}