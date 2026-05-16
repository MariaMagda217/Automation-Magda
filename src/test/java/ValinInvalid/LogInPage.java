package ValinInvalid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    WebDriver driver;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    public LogInPage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void valid() {
        this.username.sendKeys("student");
        this.password.sendKeys("Password123");
        this.submitBtn.click();
    }

    public void invalid() {
        this.username.sendKeys("student");
        this.password.sendKeys("Password123");
        this.submitBtn.click();
    }
}
