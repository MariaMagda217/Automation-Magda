package curs.PageFactoryExercise.PageFactory;

import BaseTest.BaseTest;
import curs.PageFactoryExercise.CheckBoxFactory.CheckBoxPages;
import org.testng.annotations.Test;

public class HerokuAppTests extends BaseTest {

    @Test
    public void checkBoxesTests() {

        CheckBoxPages checkBoxPages = new CheckBoxPages(driver);
        checkBoxPages.clickCheckBox1();
        checkBoxPages.clickCheckBox2();
    }

    public void dropdownTest() {

        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.selectOptionFromDropdown("Option 1");
        dropDownPage.selectOptionFromDropdown("Option 2");
    }
}
