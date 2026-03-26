package curs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Challenge {
    WebDriver driver;

    @Test
    public void threeTabs() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        String mainTab = driver.getWindowHandle();
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/elements");
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(mainTab);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/alerts");
        System.out.println(driver.getTitle());

        driver.close();
        //driver.quit();
    }
}
