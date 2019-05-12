package pageobjects;

import framework.MasterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;

public class Ebay_Home_Page extends MasterPage {

    static WebDriver driver;

    @FindBy(xpath = "//input[@id='gh-ac']")      
    WebElement searchText;
    private Product_List obj_Product_List;
    private Search_Page objSearch;
        
    public Ebay_Home_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
        objSearch = new Search_Page(driver);    
        PageFactory.initElements(driver, this);
    }

    public void Verify_Ebay_Home_Page(){  
    	if (isElementPresent(searchText))
    	Assert.assertEquals(true, driver.getTitle().toLowerCase().contains("ebay"));
       // verify_Element_displayed(searchText);        
    }

    public void Verify_Search_Result(String strItem){

        obj_Product_List.click_first_Product_in_List(strItem);
    }
    
    public void Search_Item(String strItem){
        objSearch.Search_Item(strItem);
    }   

    
    
}
