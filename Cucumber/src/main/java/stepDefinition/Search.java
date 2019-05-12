package stepDefinition;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataprovider.ConfigFileReader;
import framework.MasterHomeScenarioPage;

//import managers.PageObjectManager;

@SuppressWarnings("deprecation")
public class Search extends MasterHomeScenarioPage {

	static WebDriver driver;
	private final String propertyFilePath= "\\Configs\\data_set.properties";
	private Properties properties;
	ConfigFileReader configFileReader= new ConfigFileReader();
	
	@Given("^I have launched browser$")
	public void i_have_launched_browser() {
		Init_Setup();
		Verify_Browser_Launched();		
	}
		 
	@Given("I am on ebay home page")
	 public void Navigate_To_Ebay() throws  IOException{		
	    Launch_URL();
	    obj_Home_Page.Verify_Ebay_Home_Page();	    
	}
	
	@When("^I visit the home page$")
	public void i_visit_the_home_page() throws IOException {
		 String URL= configFileReader.getApplicationUrl();
	     Launch_URL();				 
	     
	}
	
	@Then("^user should be able to see ebay home page$")
	public void user_should_be_able_to_see_ebay_home_page() {
		// Write code here that turns the phrase above into concrete actions
		obj_Home_Page.Verify_Ebay_Home_Page();
		
	}
	
	@When("I search for \"(.*)\"")
    public void Search_For_Item(String strItem){
       obj_Home_Page.Search_Item(strItem);
       
    }
	
	@Then("I can see search results for \"(.*)\"")
	public void Verify_Search_Result(String strItem){
		if (obj_product_list.verify_Product_in_List()) {
		System.out.println("Product found in item");		
		}  
		
	 }
	
	@Then("^I select the \"(.*)\" in the search results$")
	public void i_click_the_first_item_in_the_search_results(String booktitle) {
	    obj_product_list.click_first_Product_in_List(booktitle);
	    
	}
	
	@Then("^I add item to the cart$")
	public void i_add_item_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj_product_list.click_add_to_Cart();
		obj_product_list.verifycheckoutbutton();
		
	}
	
	@Then("^I remove item from the cart$")
	public void i_click_remove_item_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
		obj_product_list.remove_item_from_cart();		    
	}
	
	@Then("^verify the item status$")
	public void verify_the_heading() {
	    // Write code here that turns the phrase above into concrete actions
		obj_product_list.item_status();
		After_Setup();
	}

}
