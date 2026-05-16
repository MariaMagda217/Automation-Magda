package curs.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

//    By username = By.id("user-name");
//    By password = By.xpath("//input[@placeholder = 'Password']");
//    By logInBtn = By.xpath("//input[@data-test = 'login-button']");

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder = 'Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@data-test = 'login-button']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage loginAs(String username, String password) {
//        driver.findElement(this.username).sendKeys(username);
//        driver.findElement(this.password).sendKeys(password);
//
//        driver.findElement(this.logInBtn).click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();

        return new HomePage(driver);
    }
}
