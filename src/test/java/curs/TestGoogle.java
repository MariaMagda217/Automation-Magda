package curs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogle {
    @Test
    public void openGoogle() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }

    public static class CheckOutTest {
        @Test(groups = {"smoke", "regression"})
        public void addToCart() {

        }

        @Test(groups = {"regression"})
        public void removeFromCart() {
        }

        @Test(groups = {"regression", "slow"})
        public void checkOut() {

        }
    }
}




