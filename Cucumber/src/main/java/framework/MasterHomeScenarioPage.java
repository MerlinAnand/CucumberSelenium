package framework;

import pageobjects.Ebay_Home_Page;
import pageobjects.Product_List;
import pageobjects.Search_Page;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataprovider.ConfigFileReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Created by Merlin on 11/05/2019.
 */
public class MasterHomeScenarioPage {

  static WebDriver driver;
  protected static Ebay_Home_Page obj_Home_Page;
  protected static Product_List obj_product_list;
  protected static Search_Page obj_search_page;
  protected Properties configProp = new Properties();
  protected InputStream in = this.getClass().getClassLoader().getResourceAsStream("data_set.properties");
  ConfigFileReader configFileReader= new ConfigFileReader();

  public void Init_Setup(){
	System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
    driver = new ChromeDriver();
    obj_Home_Page= new Ebay_Home_Page(driver);
    obj_product_list= new Product_List(driver);
    obj_search_page = new Search_Page(driver);
  }

  public void After_Setup(){
    driver.quit();
    obj_Home_Page=null;
    obj_product_list=null;
  }

  public void Launch_URL(){
	String URL= configFileReader.getApplicationUrl();	
    driver.get(URL);
    driver.manage().window().maximize();
  }

  public void Verify_Browser_Launched(){

    String result = driver.toString();
    Assert.assertFalse("Browser not launched", result.isEmpty());
  }


}
