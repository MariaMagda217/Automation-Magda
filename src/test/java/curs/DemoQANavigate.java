package curs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQANavigate {
    WebDriver driver;

    public void exNav1() {
        driver = new ChromeDriver();
    }

    @Test
    public void exNav2() {
        driver.get("https://demoqa.com/");
        String titlulPaginii = driver.getTitle();
        System.out.println(titlulPaginii);

        try {
            Thread.sleep(1000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://demoqa.com/elements");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().forward();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
    }

    @Test
    public void originalTabTest() {
        driver.get("https://demoqa.com/");
        String originalTab = driver.getWindowHandle();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");
        driver.switchTo().window(originalTab);
    }

    @Test
    public void exer2() {
        driver.get("https://demoqa.com/");

        driver.get("https://demoqa.com/elements");
        String elementsTitle = driver.getTitle();

        driver.get("https://demoqa.com/forms");

        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("elements"), "We are not in a correct page");

        driver.navigate().forward();
        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("forms"), "We are not in a forms page");
        driver.navigate().refresh();
    }

    @Test
    public void navigateTab() {
        driver.get("https://demoqa.com/");
        String pageTitle = driver.getTitle();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.navigate().to("https://demoqa.com/widgets");
        driver.navigate().back();
        driver.navigate().back();

        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, pageTitle);
    }
}


