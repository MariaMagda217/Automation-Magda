package curs.PageFactoryExercise.CheckBoxFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPages {
    WebDriver driver;

    @FindBy(xpath = "(//input[@type= 'checkbox'])[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "(//input[@type= 'checkbox'])[2]")
    private WebElement checkbox2;

    public CheckBoxPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickCheckBox1() {
        checkbox1.click();
    }

    public void clickCheckBox2() {
        checkbox2.click();
    }
}
