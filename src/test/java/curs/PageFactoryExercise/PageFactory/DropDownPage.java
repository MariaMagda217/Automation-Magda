package curs.PageFactoryExercise.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;

    @FindBy(id = "dropdown")
    private WebElement dropDown;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectOptionFromDropdown(String option) {
        Select dropdown = new Select(this.dropDown);
        dropdown.selectByVisibleText(option);
    }
}
