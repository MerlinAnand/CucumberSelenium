package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

import java.sql.DriverManager;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import junit.framework.Assert;

/**
 * Created by Merlin on 11/05/2019.
 */
@SuppressWarnings("deprecation")
public class Utils {

    private WebDriver driver;
    private static Object firstHandle;
    private static Object lastHandle;

    public Utils(WebDriver driver){
        this.driver=driver;
    }
    
    public void Click(By by){driver.findElement(by).click();}
    public void Click(WebElement objTest ){
        objTest.click();}

    public String getPageTitle(){
        return  driver.getTitle();
    }
    
     
    public boolean isElementVisible(String cssLocator){
        return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
    }    
   
    public boolean isElementPresent(WebElement element) {
    	   try {
    	      element.isDisplayed();  
    	      return true;
    	   } catch (Exception e) {
    	      return false;
    	   }
    	}
    public void verify_Element_displayed(WebElement objTest){
       wait_explicit_till_element_Displayed(objTest);
       boolean result =objTest.isDisplayed();
       Assert.assertEquals(result, true);
    }

    public void verify_Element_displayed(By by){
        wait_explicit_till_element_Displayed(by);
        boolean result =driver.findElement(by).isDisplayed();
        Assert.assertEquals(result, true);
    }

    public String get_Element_Text(By by){
        return  driver.findElement(by).getText();
    }

    public void verify_Element_Text(By by, String text){

        String strExpected = driver.findElement(by).getText().toLowerCase().trim();
        Assert.assertEquals(strExpected, text.toLowerCase().trim(), "Element text not displayed as expected .Expected: "+text.toLowerCase()+" and Actual is : "+strExpected);
    }

    public String get_Attribute_Value(By by, String strAttribute){
        String result = driver.findElement(by).getAttribute(strAttribute);
        return  result;
    }

    public void wait_explicit_till_element_Displayed(By by){

    	WebDriverWait waitnew=new WebDriverWait(driver,20);
        WebElement element = waitnew.until(ExpectedConditions.visibilityOfElementLocated(by));       
    }

    public void wait_explicit_till_element_Displayed(WebElement objTest){
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        WebElement element = waitnew.until(ExpectedConditions.visibilityOf(objTest));       
    }

    public void typeText(WebElement objInput, String text) {    	
        objInput.clear();
        objInput.sendKeys(text);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public List get_Element_List(By by) {
        List<WebElement> lisElement = driver.findElements(by);
        return lisElement;
    }

}
