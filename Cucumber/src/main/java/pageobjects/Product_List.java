	package pageobjects;
	
	import framework.MasterPage;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.junit.*;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	
	/**
	 * Created by merlin on 11/05/2019.
	 */
	public class Product_List extends MasterPage {
	
	    static WebDriver driver;
	  
	    @FindBy(xpath = "//a[@id='atcRedesignId_btn']")      
	    WebElement addToCart;
	    
	    @FindBy(xpath = "//div[@class='app-atc-layer__actionRow']/a[@href='https://cart.ebay.com.au?_trksid=p2484178.m4865.l8876']")      
	    WebElement goToCart;	
	    
	    @FindBy(xpath = "//button[@class='call-to-action btn btn--large btn--primary']")  
	    WebElement checkOutButton;
	    
	    @FindBy(xpath = "//button[@data-test-id='cart-remove-item']")      
	    WebElement removeItem;
	     
	    
	    By Search_Result_Product = By.xpath("//div[@id='srp-river-results']//li");
	
	    public Product_List(WebDriver driver){
	        super(driver);
	        this.driver = driver;
	    }
	  
	    public void click_add_to_Cart(){	    	  
	    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	    	  	 	
	        driver.findElement(By.xpath("//a[@id='atcRedesignId_btn']")).click();
	        click_go_to_Cart();
	    }
	
	    public void click_go_to_Cart(){
	    	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.switchTo().activeElement();
			driver.findElement(By.xpath("//div[@class='app-atc-layer__actionRow']/a[@href='https://cart.ebay.com.au?_trksid=p2484178.m4865.l8876']")).click();
			verifycheckoutbutton();	                
		 }
	 
		 public void verifycheckoutbutton(){
			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			 WebElement checkOut = driver.findElement(By.xpath("//button[@class='call-to-action btn btn--large btn--primary']"));
			 if (isElementPresent(checkOut)){
				 Assert.assertEquals("Go to checkout", checkOut.getText());
			 }
		 }
       
		 public void remove_item_from_cart(){
			driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
		 	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);   
		 }
		 
		 public void item_status(){
			 WebElement eletitle= driver.findElement(By.xpath("//div[@class='font-title-3']/span/span"));
			 String title=eletitle.getText();
			 Assert.assertEquals("You don't have any items in your cart.", title);	     
		 }		 	    
	    
	    public boolean verify_Product_in_List(){
			List<WebElement> list_Search_Result = driver.findElements(Search_Result_Product);
		    if (list_Search_Result.size() > 0 ){
		    return true;
		    }else {return false;}                 
		 }
		   
	  public void click_first_Product_in_List(String book){
			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			 for (WebElement link : allLinks) {
			   	if (link.getText().contains(book)) {
			  		link.click();
			   		break;
			 }	            	
	   }       

	}

	}
