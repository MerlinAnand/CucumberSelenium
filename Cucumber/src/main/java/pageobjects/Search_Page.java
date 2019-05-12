package pageobjects;

import framework.MasterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Merlin on 11/05/2019.
 */
public class Search_Page extends MasterPage {

    static WebDriver driver;

    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement input_Search;

    @FindBy(xpath = "//input[@id='gh-btn' and @value='Search']")
    WebElement button_Search;

    public Search_Page(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void Search_Item(String strItem){
        verify_Element_displayed(input_Search);
        typeText(input_Search, strItem);
        verify_Element_displayed(button_Search);
        Click(button_Search);
    }

}
