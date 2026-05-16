package curs.PageFactoryExercise.RadioButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioBtn {

    WebDriver driver;
    @FindBy(xpath = "//input[@id='yesRadio']/")
    private WebElement yesRadioLabel;
    @FindBy(xpath = "//input[@id='impressiveRadio']")
    private WebElement impressiveRadio;
    @FindBy(id = "yesRadio")
    private WebElement yesRadioInput;
    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadioInput;

    public RadioBtn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectYes() {
        yesRadioLabel.click();
    }

    public void selectImpressive() {
        impressiveRadio.click();
    }

    public boolean isYesSelected() {
        return yesRadioInput.isSelected();
    }

    public boolean isImpressiveSelected() {
        return impressiveRadioInput.isSelected();
    }
}
